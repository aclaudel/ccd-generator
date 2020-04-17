package clinical.document.shared;

import javax.xml.bind.annotation.XmlAttribute;

public class Telecom {
    @XmlAttribute
    public final String value;
    @XmlAttribute
    public final String use;

    public Telecom(String use, String value) {
        this.use = use;
        this.value = value;
    }

    public Telecom(String value) {
        this(null, value);
    }
}
