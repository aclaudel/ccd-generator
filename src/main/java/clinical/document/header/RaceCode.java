package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class RaceCode {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String displayName;
    @XmlAttribute
    public final String codeSystem;
    @XmlAttribute
    public final String codeSystemName;

    public RaceCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
        this.codeSystem = "2.16.840.1.113883.6.238";
        this.codeSystemName = "Race &amp; Ethnicity - CDC";
    }
}
