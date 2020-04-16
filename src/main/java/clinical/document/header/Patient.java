package clinical.document.header;

import clinical.document.shared.DocumentTime;
import clinical.document.shared.EthnicGroup;
import clinical.document.shared.GenderCode;
import clinical.document.shared.ReligiousAffiliationCode;

import javax.xml.bind.annotation.XmlElement;

public class Patient {

    @XmlElement
    public final Name name;

    @XmlElement(namespace = "urn:hl7-org:sdtc")
    public final RaceCode raceCode;

    @XmlElement
    public final GenderCode genderCode;

    @XmlElement
    public final DocumentTime birthTime;

    @XmlElement
    public final MaritalStatusCode maritalStatusCode;
    @XmlElement
    public final ReligiousAffiliationCode religiousAffiliationCode;
    @XmlElement
    public final EthnicGroup ethnicGroupCode;

    public Patient(Name name, RaceCode raceCode,
                   GenderCode gendercode, DocumentTime birthTime,
                   MaritalStatusCode maritalStatusCode,
                   ReligiousAffiliationCode religiousAffiliationCode,
                   EthnicGroup ethnicGroupCode){
        this.name = name;
        this.raceCode = raceCode;
        this.genderCode = gendercode;
        this.birthTime = birthTime;
        this.maritalStatusCode = maritalStatusCode;
        this.religiousAffiliationCode = religiousAffiliationCode;
        this.ethnicGroupCode = ethnicGroupCode;
    }
}
