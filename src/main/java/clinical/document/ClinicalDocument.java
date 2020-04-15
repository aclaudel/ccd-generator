package clinical.document;

import clinical.document.ccd.CCD;
import clinical.document.header.RealmCode;
import clinical.document.header.TemplateId;
import clinical.document.header.TypeId;

import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlRootElement(name = "clinical.document.ClinicalDocument")
@XmlSeeAlso(CCD.class)
@XmlAccessorOrder
public abstract class ClinicalDocument {

  @XmlElement
  public final RealmCode realmCode = new RealmCode();

  @XmlElement
  public final TypeId typeId = new TypeId();

  @XmlElement
  public final TemplateId templateId = new TemplateId("2.16.840.1.113883.10.20.22.1", "2015-08-01");

}
