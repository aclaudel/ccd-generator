package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class LanguageCode {

    @XmlAttribute
    private String code;

    public LanguageCode(String languageCode) {
        code = languageCode;
    }
}
