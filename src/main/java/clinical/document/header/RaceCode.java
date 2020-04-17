package clinical.document.header;

import clinical.document.model.RaceModel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="RaceCode")
@XmlEnum
public class RaceCode {

    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String displayName;

    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.6.238";
    @XmlAttribute
    public final String codeSystemName = "Race &amp; Ethnicity - CDC";

    public RaceCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public RaceCode(RaceModel model) {
        this(model.raceCode, model.raceDisplayName);
    }
}
