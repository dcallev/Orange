package co.com.choucair.certification.orange.interaction;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class Status implements Interaction {

    private Target lista2;
    private String opcion2;

    public Status(Target lista2, String opcion2) {
        this.lista2 = lista2;
        this.opcion2 = opcion2;
    }

    public static SelectLocation des(Target lista2, String opcion2) {
        return new SelectLocation(lista2, opcion2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObjeto = lista2.resolveAllFor(actor);
        for (int i = 0; i < listObjeto.size(); i++){
            if (listObjeto.get(i).getText().trim().equals(opcion2)){
                listObjeto.get(i).click();
                break;
            }
        }


    }
}
