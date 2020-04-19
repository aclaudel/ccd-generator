package clinical.document.header;

import clinical.document.model.PatientModel;
import clinical.document.shared.DocumentTime;
import clinical.document.shared.EthnicGroup;
import clinical.document.shared.GenderCode;
import clinical.document.shared.ReligiousAffiliationCode;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;
import java.util.stream.Collectors;

public class Patient {

    @XmlElement
    public Name name;

    @XmlElement
    public GenderCode genderCode;

    @XmlElement
    public DocumentTime birthTime;

    @XmlElement
    public MaritalStatusCode maritalStatusCode;
    @XmlElement
    public ReligiousAffiliationCode religiousAffiliationCode;

    @XmlElement(name = "raceCode")
    public RaceCode raceCode;

    @XmlElement(namespace = "urn:hl7-org:sdtc", name = "raceCode")
    public List<RaceCode> raceCodes;

    @XmlElement(name="ethnicGroupCode")
    public EthnicGroup ethnicGroupCode;
    @XmlElement(namespace = "urn:hl7-org:sdtc", name="ethnicGroupCode")
    public List<EthnicGroup> ethnicGroupCodes;

    @XmlElement
    public LanguageCommunication languageCommunication = new LanguageCommunication();


}
