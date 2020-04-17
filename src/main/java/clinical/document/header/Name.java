package clinical.document.header;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.Arrays;
import java.util.List;

public class Name {

    @XmlElement(name = "given")
    public final List<String> givens;

    @XmlElement
    public final Family family;

    @XmlElement
    public final String prefix;

    @XmlElement
    public final String suffix;

    public Name(String prefix, String family, String suffix, String... givens) {
        this.prefix = prefix;
        this.family = new Family(family);
        this.suffix = suffix;
        this.givens = Arrays.asList(givens);
    }
}
