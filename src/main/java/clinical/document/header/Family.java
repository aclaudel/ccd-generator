package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Family {

    @XmlAttribute
    public final String qualifier = "SP";

    @XmlValue
    public final String family;

    public Family(String family) {
        this.family = family;
    }
}
