package co.com.choucair.certification.orange.model.Entity;

import co.com.choucair.certification.orange.model.InformacionR;

import java.util.List;

public class InformacionREntity {
    public static InformacionR info = new InformacionR(getInformacionR());

    public static InformacionR getInformacionR () {return info;}

    public static void setInformacionR(List<String>informacionR){
        info.setFirst_name(informacionR.get(0));
        info.setMiddle_name(informacionR.get(1));
        info.setLast_name(informacionR.get(2));
        info.setLocation(informacionR.get(3));
        info.setOther_id(informacionR.get(4));
        info.setDate_of_birth(informacionR.get(5));
        info.setMarital_status(informacionR.get(6));
        info.setGender(informacionR.get(7));
        info.setNationality(informacionR.get(8));
        info.setDrives_license_number(informacionR.get(9));
        info.setLicense_expiry_date(informacionR.get(10));
        info.setNick_name(informacionR.get(11));
        info.setMilitary_service(informacionR.get(12));
        info.setSmoker(informacionR.get(13));
        info.setBlood_group(informacionR.get(14));
        info.setHobbies(informacionR.get(15));
        info.setEffective_from(informacionR.get(16));
        info.setRegion(informacionR.get(17));

}
}

