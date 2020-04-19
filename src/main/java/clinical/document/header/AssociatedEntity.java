package clinical.document.header;

import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AssociatedEntity {

    @XmlAttribute
    public String classCode;

    @XmlElement
    public AssociatedPerson associatedPerson;

    @XmlElement
    public Address address;

    @XmlElement
    public Telecom telecom;
}
