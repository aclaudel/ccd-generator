package clinical.document.shared;

import javax.xml.bind.annotation.XmlAttribute;

public class GenderCode {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.5.1";
    @XmlAttribute
    public final String codeSystemName = "AdministrativeGender";

    public GenderCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
