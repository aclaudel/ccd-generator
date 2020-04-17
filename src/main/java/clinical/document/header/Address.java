package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Address {

    @XmlAttribute
    public final String use;

    @XmlElement
    public final String city;
    @XmlElement(name = "streetAddressLine")
    public final String streetAddressLine1;
    @XmlElement(name = "streetAddressLine")
    public final String streetAddressLine2;
    @XmlElement
    public final String state;
    @XmlElement
    public final String country = "US";
    @XmlElement
    public final String postalCode;

    public Address(String use, String streetAddressLine1, String streetAddressLine2,
                   String city, String state, String postalCode){
        this.use = use;
        this.streetAddressLine1 = streetAddressLine1;
        this.streetAddressLine2 = streetAddressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Address(String streetAddressLine, String city, String state, String postalCode) {
        this(null, streetAddressLine, null, city, state, postalCode);
    }
}
