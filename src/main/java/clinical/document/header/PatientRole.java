package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class PatientRole {

    @XmlElement(name = "addr")
    public Address address;

    @XmlElement
    public Patient patient;
}
