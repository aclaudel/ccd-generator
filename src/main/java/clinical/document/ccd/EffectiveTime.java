package clinical.document.ccd;

import javax.xml.bind.annotation.XmlElement;

public class EffectiveTime {
    @XmlElement
    public DocumentTime low;

    @XmlElement
    public DocumentTime high;
}
