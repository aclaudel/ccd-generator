package clinical.document.header;

import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class PatientRole {
    @XmlElement
    public PatientId patientId;

    @XmlElement(name = "addr")
    public Address address;

    @XmlElement
    public Patient patient;

    @XmlElement(name = "telecom")
    public List<Telecom> telecoms;

    public void setPatientId(PatientId patientId) {
        this.patientId = patientId;
    }
}
