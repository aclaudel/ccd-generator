package clinical.document.ccd;

import javax.xml.bind.annotation.XmlElement;

public class DocumentationOf {
    @XmlElement
    public final ServiceEvent serviceEvent = new ServiceEvent();
}
