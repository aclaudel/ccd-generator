package clinical.document.ccd;

import clinical.document.ClinicalDocument;
import clinical.document.header.TemplateId;
import clinical.document.shared.DocumentTime;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement(name = "ClinicalDocument")
public class CCD extends ClinicalDocument {
    private static final TemplateId ContinuityOfCareTemplateId = new TemplateId("2.16.840.1.113883.10.20.22.1.2", "2015-08-01");

    public CCD(){
        super();
        templateIds.add(ContinuityOfCareTemplateId);
    }

}
