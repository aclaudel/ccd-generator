package clinical.document.ccd;

import clinical.document.shared.EffectiveTime;

import javax.xml.bind.annotation.XmlElement;

public class ServiceEvent {
    @XmlElement
    public final EffectiveTime effectiveTime = new EffectiveTime();
}
