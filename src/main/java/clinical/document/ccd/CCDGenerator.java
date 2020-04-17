package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.model.PatientModel;
import clinical.document.shared.*;

import java.util.Arrays;

public class CCDGenerator {

    public CCD getCcd() {
        CCD ccd = new CCD();
        PatientModel patientModel = new PatientModel();

        ccd.setPatient(patientModel);

        // TODO
        ccd.setIds(
                new PatientId("2.16.840.1.113883.4.391.313855", "9295", "Test- Hassan Burawi MYSQL V11"),
                new PatientId("2.16.840.1.113883.4.391.313855.1", "9295", "Test- Hassan Burawi MYSQL V11 ACC NO"),
                new MedicareId("2.16.840.1.113883.4.572", "123456789", "HCID")
        );

        ccd.setPatientAddress(new Address("HP", "123 Author Drive", "Suite 200","Beaverton", "OR", "97867"));


        ccd.setNok(new Name("Dick", "Derrick"));
        ccd.addGuarantor(
                new Name("Mary", "Jones"),
                new Telecom("tel:555-555-5555"),
                new Address(
                        "10 Main St",
                        "Boca Raton",
                        "FL",
                        "33432"
                )
        );

        return ccd;
    }
}
