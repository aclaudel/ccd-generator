package clinical.document.shared;

import javax.xml.bind.annotation.XmlAttribute;

public class ReligiousAffiliationCode {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String displayName;
    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.5.1076";
    @XmlAttribute
    public final String codeSystemName = "HL7 Religious Affiliation";

    public ReligiousAffiliationCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}
