package clinical.document.header;

import clinical.document.ccd.AddressBuilder;
import clinical.document.model.AddressModel;
import clinical.document.model.PersonModel;
import clinical.document.xml.XmlMarshaller;
import org.junit.jupiter.api.Test;
import org.xmlunit.assertj.XmlAssert;

import javax.xml.bind.JAXBException;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;

class ParticipantBuilderImplTest {

    private static final PersonModel guarantorModel = new PersonModel(
            "Mary", "Jones", "tel:555-555-5555",
            new AddressModel("10 Main St",
                    "Boca Raton",
                    "FL",
                    "33432"));

    private String xml = "<participant typeCode=\"INS\">\n" +
            "        <associatedEntity classCode=\"GUAR\">\n" +
            "            <associatedPerson>\n" +
            "                <name>\n" +
            "                    <given>Mary</given>\n" +
            "                    <family>Jones</family>\n" +
            "                </name>\n" +
            "            </associatedPerson>\n" +
            "            <telecom value=\"tel:555-555-5555\"/>\n" +
            "    </associatedEntity>\n" +
            "</participant>";

    @Test
    void buildParticipant() {
        AddressBuilder addressBuilder = mock(AddressBuilder.class);
        ParticipantBuilder participantBuilder = new ParticipantBuilderImpl(addressBuilder);
        try{
            participantBuilder.setPersonModel(guarantorModel);
            participantBuilder.setClass("GUAR");
            Participant participant = participantBuilder.buildParticipant();
            XmlMarshaller marshaller = new XmlMarshaller();
            String marshalled = marshaller.marshallFragment(participant, Participant.class, "participant");
            XmlAssert.assertThat(marshalled)
                    .and(this.xml)
                    .ignoreWhitespace()
                    .areIdentical();

        } catch (JAXBException e) {
          fail(e.getMessage());
        }
    }
}