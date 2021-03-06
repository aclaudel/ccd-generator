package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class PatientId {
    @XmlAttribute
    public final String root;
    @XmlAttribute
    public final String extension;
    @XmlAttribute
    public final String assigningAuthorityName;

    public PatientId(String root, String extension, String assigningAuthorityName) {
        this.extension = extension;
        this.assigningAuthorityName = assigningAuthorityName;
        this.root = root;
    }
}
