package clinical.document;

import clinical.document.header.*;
import clinical.document.header.PatientId;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;


public abstract class ClinicalDocument {

  @XmlElement
  public final USRealmCode realmCode = new USRealmCode();

  @XmlElement
  public final ClinicalDocumentTypeId typeId = new ClinicalDocumentTypeId();

  @XmlElement(name = "templateId")
  public final ArrayList<TemplateId> templateIds = new ArrayList<>();

  @XmlElement
  public final RecordTarget recordTarget = new RecordTarget();


  public ClinicalDocument(){
    templateIds.add(new TemplateId("2.16.840.1.113883.10.20.22.1", "2015-08-01"));
  }

  public void setPatient(Patient patient){
    this.recordTarget.patientRole.patient = patient;
  }

  public void setPatientAddress(Address address)
  {
    this.recordTarget.patientRole.address = address;
  }

  public void setPatientId(PatientId patientId) {
    this.recordTarget.patientRole.patientId = patientId;
  }
}
