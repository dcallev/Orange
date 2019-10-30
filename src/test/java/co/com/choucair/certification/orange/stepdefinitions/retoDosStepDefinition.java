package co.com.choucair.certification.orange.stepdefinitions;

import co.com.choucair.certification.orange.tasks.OpenUp;
import co.com.choucair.certification.orange.tasks.Registrar;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class retoDosStepDefinition {

    @Given("^that (.*) needs to create an employee at the OrageHR$")
    public void thatJuanNeedsToCreateAnEmployeeAtTheOrageHR(String juan) {
        theActorCalled(juan).wasAbleTo(OpenUp.OrangeHRMDemopage());
    }

    @When("^he makes the registration entry in the application$")
    public void heMakesTheRegistrationEntryInTheApplication(List<String> data) {
        theActorInTheSpotlight().attemptsTo(Registrar.la(data));

    }

    @Then("^he visualizes the new employee in the application$")
    public void heVisualizesTheNewEmployeeInTheApplication() {

    }
}

