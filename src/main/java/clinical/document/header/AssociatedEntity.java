package clinical.document.header;

import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AssociatedEntity {

    @XmlAttribute
    public final String classCode;

    @XmlElement
    public final AssociatedPerson associatedPerson;

    @XmlElement
    public final Address address;

    @XmlElement
    public final Telecom telecom;

    public AssociatedEntity(String classCode, AssociatedPerson associatedPerson, Address address, Telecom telecom) {
        this.classCode = classCode;
        this.associatedPerson = associatedPerson;
        this.address = address;
        this.telecom = telecom;
    }

    public AssociatedEntity(String classCode, Name name) {
        this(classCode, new AssociatedPerson(name), null, null);
    }

    public AssociatedEntity(String classCode, Name name, Telecom telecom, Address address) {
        this(classCode, new AssociatedPerson(name), address, telecom);
    }
}
