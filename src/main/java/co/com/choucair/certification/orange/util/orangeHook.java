package co.com.choucair.certification.orange.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class orangeHook {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
}
}
