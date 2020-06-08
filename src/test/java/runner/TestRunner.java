package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;

@CucumberOptions(features = "src/test/resources/features", glue = "steps", strict = true)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("From testNG before suit");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("From testNG before groups");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println("from testNG before class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("From TestNG before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("From TestNG before Method");
    }


    @AfterSuite
    public void afterSuit() {
        System.out.println("From testNG after suit");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("From testNG after groups");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("from testNG after class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("From TestNG after Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("From TestNG after Method");
    }

}
