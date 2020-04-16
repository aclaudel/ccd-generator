package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class PatientId {
    @XmlAttribute
    public final String root = "2.16.840.1.113883.4.1";
    @XmlAttribute
    public final String extension;

    public PatientId(String extension) {
        this.extension = extension;
    }
}
