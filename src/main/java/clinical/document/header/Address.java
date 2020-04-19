package clinical.document.header;

import clinical.document.model.AddressModel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Address {

    @XmlAttribute
    public String use;

    @XmlElement
    public String city;
    @XmlElement(name = "streetAddressLine")
    public String streetAddressLine1;
    @XmlElement(name = "streetAddressLine")
    public String streetAddressLine2;
    @XmlElement
    public String state;
    @XmlElement
    public final String country = "US";
    @XmlElement
    public String postalCode;
}
