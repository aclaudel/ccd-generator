package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class LanguageCommunication {

    @XmlElement
    private final LanguageCode languageCode;

    @XmlElement
    private final PreferenceIndicator preferenceInd = new PreferenceIndicator();

    public LanguageCommunication(LanguageCode languageCode){
        this.languageCode = languageCode;
    }
}
