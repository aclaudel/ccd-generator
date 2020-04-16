package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class PatientRole {
    @XmlElement
    public PatientId patientId;

    @XmlElement(name = "addr")
    public Address address;

    @XmlElement
    public Patient patient;

    public void setPatientId(PatientId patientId) {
        this.patientId = patientId;
    }
}
