package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class PatientRole {

    @XmlElement(name = "addr")
    public final Address address = new Address();

    @XmlElement
    public final Patient patient = new Patient();
}
