package clinical.document.shared;

import clinical.document.model.EthnicGroupModel;

import javax.xml.bind.annotation.XmlAttribute;

public class EthnicGroup {
    @XmlAttribute
    public final String code;
    @XmlAttribute
    public final String displayName;
    @XmlAttribute
    public final String codeSystem = "2.16.840.1.113883.6.238";
    @XmlAttribute
    public final String codeSystemName = "Race &amp; Ethnicity - CDC";

    public EthnicGroup(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    public EthnicGroup(EthnicGroupModel model) {
        this(model.ethnicGroupCode, model.ethnicGroupDisplayName);
    }
}
