package clinical.document.header;

import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PatientRole {

    @XmlAttribute
    public final String classCode = "PAT";

    @XmlElement(name = "id")
    public List<PatientId> patientIds = new ArrayList<>();

    @XmlElement(name = "id")
    public MedicareId medicareId;

    @XmlElement(name = "addr")
    public Address address;

    @XmlElement
    public Patient patient;

    @XmlElement(name = "telecom")
    public List<Telecom> telecoms = new ArrayList<>();

}
