package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class MedicareId {
    @XmlAttribute
    public final String root = "2.16.840.1.113883.4.572";
    @XmlAttribute
    public String extension;
    @XmlAttribute
    public final String assigningAuthorityName = "HCID";

}