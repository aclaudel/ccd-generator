package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class AssociatedEntity {

    @XmlAttribute
    public final String classCode;

    @XmlElement
    public final AssociatedPerson associatedPerson;

    public AssociatedEntity(String classCode, Name name) {
        this.classCode = classCode;
        this.associatedPerson = new AssociatedPerson(name);
    }
}
