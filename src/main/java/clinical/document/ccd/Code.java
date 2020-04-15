package clinical.document.ccd;

import javax.xml.bind.annotation.XmlAttribute;

public class Code {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String codeSystem;

    public Code(String code, String codeSystem) {
        this.code = code;
        this.codeSystem = codeSystem;
    }
}
