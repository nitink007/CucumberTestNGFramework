package runner;


import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@CucumberOptions(features = "src/test/resources",
                glue = "steps", strict = true,
                plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-html-reports"})
public class TestRunner extends AbstractTestNGCucumberTests {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("From testNG before suit");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();


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
        driver.quit();
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
