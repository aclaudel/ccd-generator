package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class RecordTarget {

    @XmlElement
    public final PatientRole patientRole = new PatientRole();

    @XmlElement
    public final Patient patient = new Patient();

}
