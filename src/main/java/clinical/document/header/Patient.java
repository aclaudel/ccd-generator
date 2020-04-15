package clinical.document.header;

import javax.xml.bind.annotation.XmlElement;

public class Patient {

    @XmlElement
    public final Name name = new Name("Eve", "Betterhalf", "SP");

}
