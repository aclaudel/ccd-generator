package clinical.document.header;

import clinical.document.model.EthnicGroupModel;
import clinical.document.model.PatientModel;
import clinical.document.model.RaceModel;
import clinical.document.shared.DocumentTime;
import clinical.document.shared.EthnicGroup;
import clinical.document.shared.GenderCode;

import java.util.stream.Collectors;

public class PatientBuilder {
    private PatientModel patientModel;

    public void setPatient(PatientModel patientModel) {

        this.patientModel = patientModel;
    }

    public Patient buildPatient() {
        Patient patient = new Patient();
        patient.name = new Name(patientModel.prefix, patientModel.family, patientModel.suffix, patientModel.givens);
        patient.raceCode = buildRaceCode(patientModel.race);
        patient.raceCodes = patientModel.additionalRaces.stream()
                .map(this::buildRaceCode)
                .collect(Collectors.toList());
        patient.genderCode = new GenderCode(patientModel.gender);
        patient.birthTime = new DocumentTime(patientModel.birthDate);
        patient.ethnicGroupCode = buildEthnicGroup(patientModel.ethnicGroup);
        patient.ethnicGroupCodes = patientModel.additionalEthnicGroups.stream()
                .map(this::buildEthnicGroup)
                .collect(Collectors.toList());
        LanguageCode languageCode = new LanguageCode();
        languageCode.code = patientModel.language;
        patient.languageCommunication.languageCode = languageCode;
        return patient;
    }

    private EthnicGroup buildEthnicGroup(EthnicGroupModel model){
        EthnicGroup ethnicGroup = new EthnicGroup();
        ethnicGroup.code = model.ethnicGroupCode;
        ethnicGroup.displayName = model.ethnicGroupDisplayName;
        return ethnicGroup;
    }

    private RaceCode buildRaceCode(RaceModel raceModel){
        RaceCode raceCode = new RaceCode();
        raceCode.code = raceModel.raceCode;
        raceCode.displayName = raceModel.raceDisplayName;
        return raceCode;
    }
}
