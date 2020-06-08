package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void beforeScenario() {
        System.out.println("Before scenario");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("Before step");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("After Step");
    }

    @After
    public void afterScenario() {
        System.out.println("After Scenario");
    }

}
