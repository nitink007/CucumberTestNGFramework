package steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

import static org.assertj.core.api.Assertions.assertThat;

public class Feature1StepDef {

    @Given("User open {string} application")
    public void userOpenApplication(String arg0) {
        if (arg0.equals("nitin2"))
            assertThat("Google").isEqualTo("Google").describedAs("Page title mismatch");
    }

    @And("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
    }
}
