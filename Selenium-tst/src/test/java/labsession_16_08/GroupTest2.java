package labsession_16_08;

import org.testng.annotations.Test;

public class GroupTest2 {

	
	  @Test(groups = { "Sanity" })
	    public void createUser() {
	        System.out.println("Create User executed - Sanity");
	    }

	    @Test(groups = { "Regression" })
	    public void updateUser() {
	        System.out.println("Update User executed - Regression");
	    }

	    @Test(groups = { "Sanity", "Regression" })
	    public void deleteUser() {
	        System.out.println("Delete User executed - Sanity & Regression");
	    }

	    @Test(groups = { "Smoke" })
	    public void viewUser() {
	        System.out.println("View User executed - Smoke");
	    }
	
}





/*
 testng.xml (Run only Sanity & Smoke, exclude Regression):
 
 
 
 <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="SanitySmokeSuite" verbose="1">
  <test name="SanitySmokeTests">
    <groups>
      <run>
        <include name="Sanity"/>
        <include name="Smoke"/>
        <exclude name="Regression"/>
      </run>
    </groups>
    <classes>
      <class name="TestNG.GroupTest2"/>
    </classes>
  </test>
</suite>

 
 
 //can create multiple xml files
 
 
 
 
 * */
 