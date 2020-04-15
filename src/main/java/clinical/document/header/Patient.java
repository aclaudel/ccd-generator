package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class Patient {

    @XmlElement
    public final Name name = new Name("Eve", "Betterhalf", "SP");

    @XmlElement(namespace = "urn:hl7-org:sdtc")
    public final RaceCode raceCode = new RaceCode(
            "2076-8",
            "Hawaiian or Other Pacific Islander"
    );

}
