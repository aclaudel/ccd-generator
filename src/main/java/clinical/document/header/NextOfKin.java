package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class NextOfKin {

    @XmlAttribute
    public final String typeCode = "INS";

    @XmlElement
    public final AssociatedEntity associatedEntity;

    public NextOfKin(Name name) {
        this.associatedEntity = new AssociatedEntity("NOK", name);
    }
}
