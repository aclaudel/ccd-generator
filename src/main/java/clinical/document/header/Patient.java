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
    public final Name name;

    @XmlElement
    public final GenderCode genderCode;

    @XmlElement
    public final DocumentTime birthTime;

    @XmlElement
    public MaritalStatusCode maritalStatusCode;
    @XmlElement
    public ReligiousAffiliationCode religiousAffiliationCode;

    @XmlElement(name = "raceCode")
    public final RaceCode raceCode;

    @XmlElement(namespace = "urn:hl7-org:sdtc", name = "raceCode")
    public final List<RaceCode> raceCodes;

    @XmlElement(name="ethnicGroupCode")
    public final EthnicGroup ethnicGroupCode;
    @XmlElement(namespace = "urn:hl7-org:sdtc", name="ethnicGroupCode")
    public final List<EthnicGroup> ethnicGroupCodes;

    @XmlElement
    private final LanguageCommunication languageCommunication;

    public Patient(PatientModel patientModel){
        this.name = new Name(patientModel.prefix, patientModel.family, patientModel.suffix, patientModel.givens);
        this.raceCode = new RaceCode(patientModel.race);
        this.raceCodes = patientModel.additionalRaces.stream()
                .map(RaceCode::new)
                .collect(Collectors.toList());
        this.genderCode = new GenderCode(patientModel.gender);
        this.birthTime = new DocumentTime(patientModel.birthDate);
        this.ethnicGroupCode = new EthnicGroup(patientModel.ethnicGroup);
        this.ethnicGroupCodes = patientModel.additionalEthnicGroups.stream()
                .map(EthnicGroup::new)
                .collect(Collectors.toList());
        this.languageCommunication = new LanguageCommunication(new LanguageCode(patientModel.language));
    }
}
