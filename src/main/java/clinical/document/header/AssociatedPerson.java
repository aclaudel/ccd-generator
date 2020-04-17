package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class AssociatedPerson {

    @XmlElement
    public final Name name;

    public AssociatedPerson(Name name) {
        this.name = name;
    }
}
