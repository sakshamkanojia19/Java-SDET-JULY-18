package Selenium_Test.Selenium_tst;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class SauceDemoE2E {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");

            // Sauce Demo known accounts (password is the same)
            String[] users = {
                    "standard_user",
                    "locked_out_user",
                    "problem_user",
                    "performance_glitch_user",
                    "error_user",
                    "visual_user"
            };
            String password = "secret_sauce";

            for (String user : users) {
                System.out.println("\n===== Testing user: " + user + " =====");
                goToLoginIfNeeded();
                attemptLogin(user, password);

                if (isLoggedIn()) {
                    System.out.println("Login success → proceeding to add items and checkout.");
                    try {
                        addSomeProductsToCart(2);          // add first 2 visible products
                        goToCart();
                        beginCheckout();
                        fillCheckoutInfo("Saksham", "K", "12345");
                        finishCheckout();
                        verifyCheckoutComplete();
                    } catch (Exception flowEx) {
                        System.out.println("Flow error for user " + user + ": " + flowEx.getMessage());
                    } finally {
                        logoutClean();
                    }
                } else {
                    // Capture error message if present
                    String err = readLoginError();
                    System.out.println("Login failed for " + user + (err.isEmpty() ? "" : " → " + err));
                }
            }
        } finally {
            sleep(1500);
            driver.quit();
        }
    }

    // ---------- Helpers ----------

    private static void goToLoginIfNeeded() {
        if (!driver.getCurrentUrl().contains("saucedemo.com")) {
            driver.get("https://www.saucedemo.com/");
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
    }

    private static void attemptLogin(String username, String password) {
        WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        WebElement passField = driver.findElement(By.id("password"));
        WebElement loginBtn  = driver.findElement(By.id("login-button"));

        userField.clear();
        userField.sendKeys(username);
        passField.clear();
        passField.sendKeys(password);
        loginBtn.click();
    }

    private static boolean isLoggedIn() {
        try {
            wait.until(ExpectedConditions.or(
                    ExpectedConditions.urlContains("inventory"),
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3[data-test='error']"))
            ));
        } catch (TimeoutException ignored) {}

        return driver.getCurrentUrl().contains("inventory");
    }

    private static String readLoginError() {
        try {
            WebElement err = driver.findElement(By.cssSelector("h3[data-test='error']"));
            return err.getText().trim();
        } catch (NoSuchElementException e) {
            return "";
        }
    }

    private static void addSomeProductsToCart(int howMany) {
        // Any add-to-cart button (data-test starts with 'add-to-cart')
        List<WebElement> addButtons = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("button[data-test^='add-to-cart']"), 0)
        );

        int added = 0;
        for (WebElement btn : addButtons) {
            if (added >= howMany) break;
            clickSafely(btn);
            added++;
        }
        System.out.println("Added " + added + " item(s) to cart.");
    }

    private static void goToCart() {
        clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.className("shopping_cart_link"))));
        wait.until(ExpectedConditions.urlContains("cart"));
    }

    private static void beginCheckout() {
        clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))));
        wait.until(ExpectedConditions.urlContains("checkout-step-one"));
    }

    private static void fillCheckoutInfo(String first, String last, String postal) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name"))).sendKeys(first);
        driver.findElement(By.id("last-name")).sendKeys(last);
        driver.findElement(By.id("postal-code")).sendKeys(postal);
        clickSafely(driver.findElement(By.id("continue")));
        wait.until(ExpectedConditions.urlContains("checkout-step-two"));
    }

    private static void finishCheckout() {
        clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.id("finish"))));
    }

    private static void verifyCheckoutComplete() {
        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
        System.out.println("Checkout result: " + header.getText());
        // Back to products (optional)
        clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.id("back-to-products"))));
        wait.until(ExpectedConditions.urlContains("inventory"));
    }

    private static void logoutClean() {
        try {
            // Open burger menu
            clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))));
            // Optional: reset app state to clear cart
            try {
                WebElement reset = wait.until(ExpectedConditions.elementToBeClickable(By.id("reset_sidebar_link")));
                clickSafely(reset);
            } catch (Exception ignored) {}
            // Logout
            clickSafely(wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
            System.out.println("Logged out & reset.");
        } catch (Exception e) {
            System.out.println("Logout/Reset skipped (probably not logged in): " + e.getMessage());
        }
    }

    private static void clickSafely(WebElement el) {
        try {
            el.click();
        } catch (ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        }
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException ignored) {}
    }
}
