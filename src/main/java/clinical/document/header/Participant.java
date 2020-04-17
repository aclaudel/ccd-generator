package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Participant {

    @XmlAttribute
    public final String typeCode = "INS";

    @XmlElement
    public final AssociatedEntity associatedEntity;

    public Participant(AssociatedEntity associatedEntity) {
        this.associatedEntity = associatedEntity;
    }
}
