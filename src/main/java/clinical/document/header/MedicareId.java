package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class MedicareId {
    @XmlAttribute
    public final String root;
    @XmlAttribute
    public final String extension;
    @XmlAttribute
    public final String assigningAuthorityName;

    public MedicareId(String root, String extension, String assigningAuthorityName) {
        this.root = root;
        this.extension = extension;
        this.assigningAuthorityName = assigningAuthorityName;
    }
}
