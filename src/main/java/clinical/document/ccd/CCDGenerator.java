package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.model.AddressModel;
import clinical.document.model.PatientModel;
import clinical.document.model.PersonModel;
import clinical.document.shared.*;

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

        PersonModel nokModel = new PersonModel("Dick", "Derrick");
        ccd.setNok(nokModel);

        PersonModel guarantorModel = new PersonModel(
                "Mary", "Jones", "tel:555-555-5555",
                new AddressModel("10 Main St",
                        "Boca Raton",
                        "FL",
                        "33432"));

        ccd.addGuarantor(guarantorModel);

        return ccd;
    }
}
