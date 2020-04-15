package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class Patient {

    @XmlElement
    public final Name name;

    @XmlElement(namespace = "urn:hl7-org:sdtc")
    public final RaceCode raceCode;

    public Patient(Name name, RaceCode raceCode){
        this.name = name;
        this.raceCode = raceCode;
    }
}
