package clinical.document.header;

import clinical.document.shared.GenderCode;

import javax.xml.bind.annotation.XmlElement;

public class Patient {

    @XmlElement
    public final Name name;

    @XmlElement(namespace = "urn:hl7-org:sdtc")
    public final RaceCode raceCode;

    @XmlElement
    public final GenderCode genderCode;

    public Patient(Name name, RaceCode raceCode, GenderCode gendercode){
        this.name = name;
        this.raceCode = raceCode;
        this.genderCode = gendercode;
    }
}
