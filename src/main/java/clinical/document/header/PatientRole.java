package clinical.document.header;

import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlElement;

public class PatientRole {
    @XmlElement
    public PatientId patientId;

    @XmlElement(name = "addr")
    public Address address;

    @XmlElement
    public Patient patient;

    @XmlElement
    public Telecom telecom;

    public void setPatientId(PatientId patientId) {
        this.patientId = patientId;
    }
}
