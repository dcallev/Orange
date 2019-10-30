package co.com.choucair.certification.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarAutomationOrangeSitePage extends PageObject {

    public static final Target LOGIN = Target.the("Loguin")
            .located(By.id("btnLogin"));

    public static final Target PIM = Target.the("PIM")
            .located(By.xpath("//span[contains(text(),'PIM')]"));

    public static final Target ADD_EMPLOYEE = Target.the("Agregar empleado")
            .located(By.xpath("//*[@" +
                    "]/span[2]"));

    public static final Target FIRST_NAME = Target.the("Primer nombre")
            .located(By.id("firstName"));

    public static final Target MIDDLE_NAME = Target.the("Segundo nombre")
            .located(By.id("middleName"));

    public static final Target LAST_NAME = Target.the("Apellido")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target BTN_LOCATION = Target.the("Botón location")
            .located(By.xpath("//div[@id='location_inputfileddiv']"));

    public static final Target LOCATION = Target.the("Locación")
            .located(By.xpath("//*[@id='location_inputfileddiv']/div"));

    public static final Target LOCATION_SELECT = Target.the("Locación")
            .located(By.xpath("//div[@id='addEmployeeModal']//li"));

    public static final Target SAVE = Target.the("Guardar")
            .located(By.xpath("//*[@id='systemUserSaveBtn']"));

    public static final Target OTHER_ID = Target.the("Otro ID")
            .located(By.xpath("//input[@id='otherId']"));

    public static final Target BIRTHDAY = Target.the("Fecha cumpleaños")
            .located(By.xpath("//input[@id='emp_birthday']"));

    public static final Target STATUSU = Target.the("Boton estado")
            .located(By.xpath("//*[@id='middleName']"));

    public static final Target STATUS = Target.the("Estado")
            .located(By.xpath("//*[@id='select-options-56df8bb8-17f7-2f6e-c028-2d1e9f11e20f']/li"));


    public static final Target GENDER_MALE = Target.the("Masculino")
            .located(By.xpath("//label[contains(text(),'Male')]"));

    public static final Target GENDER_FEMALE = Target.the("Femenino")
            .located(By.xpath("//label[contains(text(),'Female')]"));

    public static final Target NACIONALITY = Target.the("Nacionalidad")
            .located(By.xpath("//*[@id='nation_code_inputfileddiv']/div/input"));

    public static final Target LICENSE_NUMBER = Target.the("Número de licencia")
            .located(By.xpath("//input[@id='licenseNo']"));

    public static final Target EXPIRY_LICENSE = Target.the("Caducidad licencia")
            .located(By.xpath("//input[@id='emp_dri_lice_exp_date']"));


    public static final Target MILITARY_SERVICE = Target.the("Servicio militar")
            .located(By.xpath("//input[@id='militaryService']"));

    public static final Target SMOKER = Target.the("Fuma")
            .located(By.xpath("//label[contains(text(),'Smoker')]"));

    public static final Target NEXT = Target.the("Siguiente")
            .located(By.xpath("//button[@class='btn waves-effect waves-light right']"));


}
