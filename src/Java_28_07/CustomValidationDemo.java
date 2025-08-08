package Java_28_07;

import java.util.Scanner;

// 1. Custom Exceptions
class InvalidBookException extends Exception {
    public InvalidBookException(String message) {
        super(message);
    }
}

class InvalidUserException extends Exception {
    public InvalidUserException(String message) {
        super(message);
    }
}

class InvalidIdException extends Exception {
    public InvalidIdException(String message) {
        super(message);
    }
}

// 2. Book class
class Book {
    String title;

    public Book(String title) throws InvalidBookException {
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidBookException("Book title cannot be empty.");
        }
        this.title = title;
    }
}

// 3. User class
class User {
    String name;
    int id;

    public User(String name, int id) throws InvalidUserException, InvalidIdException {
        if (!name.equalsIgnoreCase("saksham")) {
            throw new InvalidUserException("User must be 'saksham'.");
        }
        if (id <= 0) {
            throw new InvalidIdException("ID must be greater than 0.");
        }
        this.name = name;
        this.id = id;
    }
}

public class CustomValidationDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input book
            System.out.print("Enter book title: ");
            String bookTitle = sc.nextLine();
            Book book = new Book(bookTitle);
            System.out.println("Book validated: " + book.title);

            // Input user
            System.out.print("Enter user name: ");
            String userName = sc.nextLine();

            System.out.print("Enter user ID: ");
            int userId = sc.nextInt();

            User user = new User(userName, userId);
            System.out.println("User validated: " + user.name + ", ID: " + user.id);

        } catch (InvalidBookException e) {
            System.out.println("Book Error: " + e.getMessage());
        } catch (InvalidUserException e) {
            System.out.println("User Error: " + e.getMessage());
        } catch (InvalidIdException e) {
            System.out.println("ID Error: " + e.getMessage());
        } catch (Throwable e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
