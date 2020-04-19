package clinical.document.ccd;

import clinical.document.header.*;
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
        CCDBuilder builder = new CCDBuilder(new RecordTargetBuilderImpl(), new ParticipantBuilderImpl());
        builder.setConfig(config);
        builder.setPatient(patientModel);
        builder.setCareTeam(careTeamModel);
        return builder.buildCCD();
    }
}