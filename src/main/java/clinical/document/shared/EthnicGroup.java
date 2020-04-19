package clinical.document.shared;

import clinical.document.model.EthnicGroupModel;

import javax.xml.bind.annotation.XmlAttribute;

public class EthnicGroup {
    @XmlAttribute
    public String code;
    @XmlAttribute
    public String displayName;
    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.6.238";
    @XmlAttribute
    public final String codeSystemName = "Race &amp; Ethnicity - CDC";

}
