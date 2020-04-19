package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class LanguageCommunication {

    @XmlElement
    public LanguageCode languageCode;

    @XmlElement
    private final PreferenceIndicator preferenceInd = new PreferenceIndicator();
}
