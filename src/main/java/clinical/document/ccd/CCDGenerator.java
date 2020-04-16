package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.shared.Telecom;

import java.time.LocalDate;

public class CCDGenerator {

    public CCD getCcd() {
        CCD ccd = new CCD();
        ccd.setPatient(new Patient(
                new Name("Eve", "Betterhalf", "SP"),
                RaceCodes.HawaiianOrOtherPacificIslander
                ));
        ccd.setPatientId(new PatientId("444222222"));
        ccd.setPatientAddress(new Address("HP", "2222 Home Street", "Beaverton", "OR", "97867"));
        ccd.setPatientTelecom(new Telecom("HP", "tel:+1(555)555-2003"));
        ccd.setEffectiveTime(LocalDate.of(1975,5,1), LocalDate.of(2013,8, 15));
        return ccd;
    }
}
