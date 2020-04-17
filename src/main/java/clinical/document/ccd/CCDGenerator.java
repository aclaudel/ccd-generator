package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.model.*;

public class CCDGenerator {

    private static final PatientModel patientModel = new PatientModel();
    private static final PersonModel nokModel = new PersonModel("Dick", "Derrick");
    private static final PersonModel guarantorModel = new PersonModel(
            "Mary", "Jones", "tel:555-555-5555",
            new AddressModel("10 Main St",
                    "Boca Raton",
                    "FL",
                    "33432"));
    private static final CareTeamModel careTeamModel = new CareTeamModel(nokModel, guarantorModel);

    private static final LocalEMRConfig config = new LocalEMRConfig();


    public CCD getCcd() {
        CCD ccd = new CCD();

        ccd.setPatient(patientModel);

        // TODO
        ccd.setIds(
                new PatientId(config.rootId1, patientModel.id, config.assigningAuthority1),
                new PatientId(config.rootId2, patientModel.id, config.assigningAuthority2),
                new MedicareId("2.16.840.1.113883.4.572", patientModel.medicareId, "HCID")
        );

        ccd.setCareTeam(careTeamModel);

        return ccd;
    }
}
