package co.com.choucair.certification.orange.tasks;

import co.com.choucair.certification.orange.interaction.SelectLocation;
import co.com.choucair.certification.orange.interaction.Status;
import co.com.choucair.certification.orange.model.Entity.InformacionREntity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static co.com.choucair.certification.orange.userinterface.RegistrarAutomationOrangeSitePage.*;
import static co.com.choucair.certification.orange.util.Constantes.MALE;
import static co.com.choucair.certification.orange.util.Constantes.YES;


public class Registrar implements Task {
    public List<String> data;

    public Registrar(List<String> data) {
        this.data = data;
    }

    public static Registrar la(List<String> data) {
        return new Registrar(data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


       InformacionREntity.setInformacionR(data);

        actor.attemptsTo(Click.on(LOGIN),
                Click.on(PIM),
                Click.on(ADD_EMPLOYEE),
                Enter.theValue(InformacionREntity.getInformacionR().getFirst_name()).into(FIRST_NAME),
                Enter.theValue(InformacionREntity.getInformacionR().getMiddle_name()).into(MIDDLE_NAME),
                Enter.theValue(InformacionREntity.getInformacionR().getLast_name()).into(LAST_NAME),

                Click.on(LOCATION),
                SelectLocation.desde(LOCATION_SELECT,InformacionREntity.getInformacionR().getLocation()),

                Click.on(SAVE),
                Enter.theValue(InformacionREntity.getInformacionR().getOther_id()).into(OTHER_ID),
                Enter.theValue(InformacionREntity.getInformacionR().getDate_of_birth()).into(BIRTHDAY),

                Click.on(STATUSU),
                Status.des(STATUS,InformacionREntity.getInformacionR().getMarital_status()),


                Check.whether(InformacionREntity.getInformacionR().getGender().equals(MALE))
                                            .andIfSo(Click.on(GENDER_MALE))
                                            .otherwise(Click.on(GENDER_FEMALE)),
                Click.on(NACIONALITY),
                Click.on("//span[contains(text(),'"+InformacionREntity.getInformacionR().getNationality()+"')]"),

                Enter.theValue(InformacionREntity.getInformacionR().getLicense_expiry_date()).into(EXPIRY_LICENSE),

                Enter.theValue(InformacionREntity.getInformacionR().getMilitary_service()).into(LICENSE_NUMBER),

                Enter.theValue(InformacionREntity.getInformacionR().getMilitary_service()).into(MILITARY_SERVICE),

                Check.whether(InformacionREntity.getInformacionR().getSmoker().equals(YES))
                                                .andIfSo(Click.on(SMOKER)),
                Click.on(NEXT)
























        );


    }
}
