package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.shared.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
                RaceCodes.AMERICAN_INDIAN_OR_ALASKA_NATIVE,
                Arrays.asList(RaceCodes.APACHE),
                new EthnicGroup("2186-5", "Not Hispanic or Latino"),
                Arrays.asList(new EthnicGroup("2144-4", "Valencian")),
                new LanguageCode("en")));

        ccd.setPatientId(new PatientId("444222222"));
        ccd.setPatientAddress(new Address("HP", "2222 Home Street", "Beaverton", "OR", "97867"));
        ccd.setPatientTelecom(new Telecom("HP", "tel:+1(555)555-2003"));

        return ccd;
    }
}
