package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;

public class PatientId {
    @XmlAttribute
    public String root;
    @XmlAttribute
    public String extension;
    @XmlAttribute
    public String assigningAuthorityName;
}
