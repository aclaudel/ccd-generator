package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.shared.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CCDGenerator {

    public CCD getCcd() {
        CCD ccd = new CCD();

        ccd.setPatient(new Patient(
                new Name("Eve", "Betterhalf", "SP"),
                new GenderCode("F"),
                new DocumentTime(LocalDate.of(1975,5,1)),
                Stream.of(
                        RaceCodes.AMERICAN_INDIAN_OR_ALASKA_NATIVE
                ).collect(Collectors.toList()),
                Stream.of(
                        new EthnicGroup("2186-5", "Not Hispanic or Latino")
                ).collect(Collectors.toList()),
                new LanguageCode("en")));

        ccd.setPatientId(new PatientId("444222222"));
        ccd.setPatientAddress(new Address("HP", "2222 Home Street", "Beaverton", "OR", "97867"));
        ccd.setPatientTelecom(new Telecom("HP", "tel:+1(555)555-2003"));
        ccd.setEffectiveTime(LocalDate.of(1975,5,1), LocalDate.of(2013,8, 15));

        return ccd;
    }
}
