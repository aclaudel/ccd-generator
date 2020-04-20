package clinical.document.ccd;

import clinical.document.header.ParticipantBuilder;
import clinical.document.header.RecordTargetBuilder;
import clinical.document.model.*;
import clinical.document.xml.XmlMarshaller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xmlunit.assertj.XmlAssert;

import javax.xml.bind.JAXBException;

import static org.mockito.Mockito.mock;

class CCDBuilderTest {

    String xml ="<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"yes\"?>\n" +
            "<ClinicalDocument xmlns:ns2=\"urn:hl7-org:sdtc\">\n" +
            "    <realmCode code=\"US\"/>\n" +
            "    <typeId root=\"2.16.840.1.113883.1.3\" extension=\"POCD_HD000040\"/>\n" +
            "    <templateId root=\"2.16.840.1.113883.10.20.22.1\" extension=\"2015-08-01\"/>\n" +
            "    <templateId root=\"2.16.840.1.113883.10.20.22.1.2\" extension=\"2015-08-01\"/>\n" +
            "</ClinicalDocument>";


    RecordTargetBuilder recordTargetBuilder;

    private ParticipantBuilder participantBuilder;


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

    @Test
    public void build() {
        recordTargetBuilder = mock(RecordTargetBuilder.class);
        participantBuilder = mock(ParticipantBuilder.class);
        CCDBuilder ccdBuilder = new CCDBuilder(recordTargetBuilder, participantBuilder);
        try {
        ccdBuilder.setConfig(config);
        ccdBuilder.setCareTeam(careTeamModel);
        ccdBuilder.setPatient(patientModel);
        CCD ccd = ccdBuilder.buildCCD();
        XmlMarshaller marshaller = new XmlMarshaller();

        String marshalled = marshaller.marshall(ccd);
        XmlAssert.assertThat(marshalled)
            .and(this.xml)
            .areIdentical();
        } catch (JAXBException e) {
            Assertions.fail();
        }


    }
}