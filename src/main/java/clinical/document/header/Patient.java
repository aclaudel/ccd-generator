package clinical.document.header;

import clinical.document.shared.DocumentTime;
import clinical.document.shared.EthnicGroup;
import clinical.document.shared.GenderCode;
import clinical.document.shared.ReligiousAffiliationCode;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Patient {

    @XmlElement
    public final Name name;

    @XmlElement
    public final GenderCode genderCode;

    @XmlElement
    public final DocumentTime birthTime;

    @XmlElement
    public MaritalStatusCode maritalStatusCode;
    @XmlElement
    public ReligiousAffiliationCode religiousAffiliationCode;

    @XmlElement(namespace = "urn:hl7-org:sdtc", name = "raceCode")
    public final List<RaceCode> raceCodes;

    @XmlElement(name="ethnicGroupCode")
    public final List<EthnicGroup> ethnicGroupCodes;

    @XmlElement
    private final LanguageCommunication languageCommunication;


    public Patient(Name name,
                   GenderCode gendercode,
                   DocumentTime birthTime,
                   List<RaceCode> raceCodes,
                   List<EthnicGroup> ethnicGroupCodes,
                   LanguageCode language){
        this.name = name;
        this.raceCodes = raceCodes;
        this.genderCode = gendercode;
        this.birthTime = birthTime;
        this.ethnicGroupCodes = ethnicGroupCodes;
        this.languageCommunication = new LanguageCommunication(language);
    }
}
