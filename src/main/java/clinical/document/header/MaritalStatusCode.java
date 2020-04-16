package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class MaritalStatusCode {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String displayName;
    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.5.2";
    @XmlAttribute
    public final String codeSystemName = "MaritalStatusCode";

    public MaritalStatusCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}
