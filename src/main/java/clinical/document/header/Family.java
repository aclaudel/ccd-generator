package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Family {

    @XmlAttribute
    public final String qualifier;

    @XmlValue
    public final String family;

    public Family(String familyName, String qualifier) {
        this.family = familyName;
        this.qualifier = qualifier;
    }
}
