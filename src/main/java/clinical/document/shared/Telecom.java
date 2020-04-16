package clinical.document.shared;

import javax.xml.bind.annotation.XmlAttribute;

public class Telecom {
    @XmlAttribute
    public final String use;
    @XmlAttribute(name = "value")
    public final String number;

    public Telecom(String use, String number) {
        this.use = use;
        this.number = number;
    }
}
