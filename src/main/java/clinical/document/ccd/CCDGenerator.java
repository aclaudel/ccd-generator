package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.shared.*;

import java.time.LocalDate;
import java.util.Arrays;

public class CCDGenerator {

    public CCD getCcd() {
        CCD ccd = new CCD();

        ccd.setPatient(new Patient(
                new Name("Mr", "Newman", "III", "Christopher", "Frank"),
                new GenderCode("F"),
                new DocumentTime(LocalDate.of(1975,5,1)),
                RaceCodes.AMERICAN_INDIAN_OR_ALASKA_NATIVE,
                Arrays.asList(RaceCodes.APACHE),
                new EthnicGroup("2186-5", "Not Hispanic or Latino"),
                Arrays.asList(new EthnicGroup("2144-4", "Valencian")),
                new LanguageCode("en")));

        ccd.setIds(
                new PatientId("2.16.840.1.113883.4.391.313855", "9295", "Test- Hassan Burawi MYSQL V11"),
                new PatientId("2.16.840.1.113883.4.391.313855.1", "9295", "Test- Hassan Burawi MYSQL V11 ACC NO"),
                new MedicareId("2.16.840.1.113883.4.572", "123456789", "HCID")
        );

        ccd.setPatientAddress(new Address("HP", "123 Author Drive", "Suite 200","Beaverton", "OR", "97867"));
        ccd.setPatientTelecoms(Arrays.asList(
                new Telecom("HP", "tel:+1(555)555-2003"),
                new Telecom("MC", "tel:508-259-5882"),
                new Telecom("mailto:hassan.burawi@eclinicalworks.com")
        ));

        ccd.setNok(new Name("Dick", "Derrick"));

        return ccd;
    }
}
