package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Name {

    @XmlAttribute
    public final String use = "L";
    @XmlElement
    public final String given;

    @XmlElement
    public final Family family;

    public Name(String given, String family, String qualifier) {
        this.given = given;
        this.family = new Family(family, qualifier);
    }
}
