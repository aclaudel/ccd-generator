package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Address {

    @XmlAttribute
    public final String use = "HP";

    @XmlElement
    public final String streetAddressLine = "2222 Home Street";

    @XmlElement
    public final String city = "Beaverton";

    @XmlElement
    public final String state = "OR";

    @XmlElement
    public final String postalCode = "97867";

    @XmlElement
    public final String country = "US";

}
