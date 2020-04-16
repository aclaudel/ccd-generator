package clinical.document.shared;

import clinical.document.shared.DocumentTime;

import javax.xml.bind.annotation.XmlElement;

public class EffectiveTime {
    @XmlElement
    public DocumentTime low;

    @XmlElement
    public DocumentTime high;
}
