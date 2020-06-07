package steps;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.testng.annotations.BeforeClass;

public class Hooks {

    @Before
    public void setupScenario() {
        System.out.println("Before scenario");
    }

    @BeforeStep
    public void setupStep() {
        System.out.println("Before step");
    }

    @BeforeClass
    public void beforeClassTestNG() {
        System.out.println("Before class TestNG");
    }

}
