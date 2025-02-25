package runner;


import com.google.common.collect.ImmutableList;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.network.Network;
import org.openqa.selenium.devtools.network.model.BlockedReason;
import org.openqa.selenium.devtools.network.model.ResourceType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@CucumberOptions(features = "src/test/resources",
                glue = "steps", strict = true,
                plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-html-reports"})
public class TestRunner extends AbstractTestNGCucumberTests {

    RemoteWebDriver driver;

    @BeforeSuite
    public void beforeSuit() throws MalformedURLException {
        System.out.println("From testNG before suit");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        DevTools devTools = driver.getDevTools();


        // ----------------------- Experiment -----------------------

        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.LINUX);

        URL url = new URL("http://localhost:4444/wd/hub");

//        System.setProperty("webdriver.chrome.driver","/home/nitin/Downloads/chromedriver");
        driver = new RemoteWebDriver(url, dc);
        driver.get("https://google.com");
        System.out.println(driver.getTitle());



//        //enable Network
//        devTools.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
//
//        devTools.addListener(responseRecieved(), responseRecieved -> {
//            Assert.assertNotNull(responseRecieved.ge);
//        });
//
//        //set blocked URL patterns
//        devTools.send(Network.setBlockedURLs(ImmutableList.of("*.css", "*.png")));
//
//        //add event listener to verify that css and png are blocked
//        devTools.addListener(Network.loadingFailed(), loadingFailed -> {
//
//            if (loadingFailed.getResourceType().equals(ResourceType.Stylesheet)) {
//                Assert.assertEquals(loadingFailed.getBlockedReason(), BlockedReason.inspector);
//            }
//
//            else if (loadingFailed.getResourceType().equals(ResourceType.Image)) {
//                Assert.assertEquals(loadingFailed.getBlockedReason(), BlockedReason.inspector);
//            }
//
//        });

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
