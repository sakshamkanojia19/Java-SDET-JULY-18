package labsession_16_08;


import org.testng.annotations.Test;
public class GroupTest1 {

	
	 @Test(groups = { "Smoke" })
	    public void loginTest() {
	        System.out.println("Login test executed - Smoke");
	    }

	    @Test(groups = { "Regression" })
	    public void paymentTest() {
	        System.out.println("Payment test executed - Regression");
	    }

	    @Test(groups = { "Smoke", "Regression" })
	    public void logoutTest() {
	        System.out.println("Logout test executed - Smoke & Regression");
	    }
}



/*
testng.xml (Run only Smoke group):

<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="SmokeSuite" verbose="1">
  <test name="SmokeTests">
    <groups>
      <run>
        <include name="Smoke"/>
      </run>
    </groups>
    <classes>
      <class name="TestNG.GroupTest1"/>
    </classes>
  </test>
</suite>



 * */
 