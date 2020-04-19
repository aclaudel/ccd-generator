package clinical.document.header;

import clinical.document.model.LocalEMRConfig;
import clinical.document.model.PatientModel;

public interface RecordTargetBuilder {
    void setPatient(PatientModel patientModel);

    void setConfig(LocalEMRConfig config);

    RecordTarget buildRecordTarget();
}
