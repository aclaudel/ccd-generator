package clinical.document.header;

import clinical.document.ccd.AddressBuilderImpl;
import clinical.document.model.LocalEMRConfig;
import clinical.document.model.PatientModel;
import clinical.document.shared.Telecom;

public class RecordTargetBuilderImpl implements RecordTargetBuilder {
    private LocalEMRConfig config;
    private PatientModel patientModel;

    @Override
    public void setPatient(PatientModel patientModel) {
        this.patientModel = patientModel;
    }

    @Override
    public void setConfig(LocalEMRConfig config){
        this.config = config;
    }

    @Override
    public RecordTarget buildRecordTarget(){
        RecordTarget recordTarget = new RecordTarget();
        PatientId patientId1 = buildPatientId(config.rootId1, patientModel.id, config.assigningAuthority1);
        recordTarget.patientRole.patientIds.add(patientId1);
        PatientId patientId2 = buildPatientId(config.rootId2, patientModel.id, config.assigningAuthority2);
        recordTarget.patientRole.patientIds.add(patientId2);
        recordTarget.patientRole.medicareId = new MedicareId();
        recordTarget.patientRole.medicareId.extension = patientModel.medicareId;

        PatientBuilder patientBuilder = new PatientBuilder();
        patientBuilder.setPatient(patientModel);
        recordTarget.patientRole.patient =patientBuilder.buildPatient();

        Telecom homePhone = new HomePhone();
        homePhone.value = patientModel.homePhone;
        recordTarget.patientRole.telecoms.add(homePhone);

        Telecom mobilePhone = new MobilePhone();
        mobilePhone.value = patientModel.mobilePhone;
        recordTarget.patientRole.telecoms.add(mobilePhone);

        Telecom email = new Email();
        email.value = patientModel.email;
        recordTarget.patientRole.telecoms.add(email);

        AddressBuilderImpl addressBuilder = new AddressBuilderImpl();
        addressBuilder.setUse("HP");
        addressBuilder.setAddressModel(patientModel.address);
        recordTarget.patientRole.address = addressBuilder.buildAddress();
        return recordTarget;
    }

    private PatientId buildPatientId(String root, String extension, String authority){
        PatientId patientId2 = new PatientId();
        patientId2.root = root;
        patientId2.extension = extension;
        patientId2.assigningAuthorityName = authority;
        return patientId2;
    }
}
