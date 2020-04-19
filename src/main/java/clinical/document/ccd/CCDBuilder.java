package clinical.document.ccd;

import clinical.document.header.*;
import clinical.document.model.CareTeamModel;
import clinical.document.model.LocalEMRConfig;
import clinical.document.model.PatientModel;
import clinical.document.model.PersonModel;

public class CCDBuilder {

    private LocalEMRConfig config;
    private PatientModel patientModel;
    private CareTeamModel careTeamModel;
    private final RecordTargetBuilder recordTargetBuilder;
    private final ParticipantBuilder participantBuilder;

    public void setPatient(PatientModel patientModel) {
        this.patientModel = patientModel;
    }

    public void setCareTeam(CareTeamModel careTeamModel) {
        this.careTeamModel = careTeamModel;
    }

    public void setConfig(LocalEMRConfig config) {
        this.config = config;
    }

    public CCDBuilder(RecordTargetBuilder recordTargetBuilder, ParticipantBuilder participantBuilder){

        this.recordTargetBuilder = recordTargetBuilder;
        this.participantBuilder = participantBuilder;
    }

    public CCD buildCCD(){

        recordTargetBuilder.setPatient(patientModel);
        recordTargetBuilder.setConfig(this.config);
        CCD ccd = new CCD();
        ccd.recordTarget = recordTargetBuilder.buildRecordTarget();

        ccd.setParticipant(buildParticipant("NOK", careTeamModel.nok));
        ccd.setParticipant(buildParticipant("GUAR", careTeamModel.guarantor));
        return ccd;
    }

    private Participant buildParticipant(String classCode, PersonModel person){
        participantBuilder.setClass(classCode);
        participantBuilder.setPersonModel(person);
        return participantBuilder.buildParticipant();
    }
}