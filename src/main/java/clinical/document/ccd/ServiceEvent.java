package clinical.document.ccd;

import javax.xml.bind.annotation.XmlElement;

public class ServiceEvent {
    @XmlElement
    public final EffectiveTime effectiveTime = new EffectiveTime();
}
