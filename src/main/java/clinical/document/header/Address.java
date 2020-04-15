package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Address {

    @XmlAttribute
    public final String use;

    @XmlElement
    public final String streetAddressLine;

    @XmlElement
    public final String city;

    @XmlElement
    public final String state;

    @XmlElement
    public final String postalCode;

    @XmlElement
    public final String country = "US";

    public Address(String use, String streetAddressLine, String city, String state, String postalCode){

        this.use = use;
        this.streetAddressLine = streetAddressLine;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
}
