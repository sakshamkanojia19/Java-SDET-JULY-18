package TestNG;

import org.testng.annotations.Test;

public class TestNGGroups {

    @Test(groups = {"Sanity", "Regression"})
    public void testcase1() {
        System.out.println("Testcase1 is executed");
    }

    @Test(groups = {"Regression"})
    public void testcase2() {
        System.out.println("Testcase2 is executed");
    }

    @Test(groups = {"Sanity"})
    public void testcase3() {
        System.out.println("Testcase3 is executed");
    }

    @Test(groups = {"Regression"})
    public void testcase4() {
        System.out.println("Testcase4 is executed");
    }

    /*
     * Example TestNG XML for groups:
     * 
<test name="GroupTest">
      <groups>
        <run>
       
        <include name="Regression"/>
      </run>
    </groups>
    <classes>
      <class name="TestNG.TestNGGroups"/>
      <class name="TestNG.TestNGDependency"/>
    </classes>
  </test>
     * 
     */
}






/*
 * 
 * real ones replace above ones  : 
 * 
 * 
 * <parameter name="browser" value="chrome"/>
<parameter name="platform" value="windows"/>
  <test name="sampletest">
    <classes>
      <class name="TestNG.TestNGLaunchBrowser"/>
       <class name="TestNG.TestNGMultipleTestcases"/>
             <class name="TestNG.TestNy"/>
             <class name="TestNG.TestNGParameters"></class>
    </classes>
 * 
 * 
 * */
 