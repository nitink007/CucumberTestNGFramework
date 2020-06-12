package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class Feature1StepDef {

    @Given("User open {string} application")
    public void userOpenApplication(String arg0) {
        if (arg0.equals("nitin2"))
            Assert.fail("known failure");
    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
    }
}
