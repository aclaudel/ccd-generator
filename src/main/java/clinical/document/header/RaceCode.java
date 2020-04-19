package clinical.document.header;

import clinical.document.model.RaceModel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RaceCode")
@XmlEnum
public class RaceCode {

    @XmlAttribute
    public String code;
    @XmlAttribute
    public String displayName;

    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.6.238";
    @XmlAttribute
    public final String codeSystemName = "Race &amp; Ethnicity - CDC";
}
