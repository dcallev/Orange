package co.com.choucair.certification.orange.tasks;

import co.com.choucair.certification.orange.userinterface.AbrirAutomationOrangeSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private AbrirAutomationOrangeSitePage abrirAutomationOrangeSitePage;

    public static Performable OrangeHRMDemopage() {

        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirAutomationOrangeSitePage));



    }
}
