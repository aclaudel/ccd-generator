package clinical.document;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public abstract class ClinicalDocument {
  public static final TemplateId ClinicalDocumentTemplateId = new TemplateId("2.16.840.1.113883.10.20.22.1", "2015-08-01");
  @XmlElement
  public final USRealmCode realmCode = new USRealmCode();

  @XmlElement
  public final ClinicalDocumentTypeId typeId = new ClinicalDocumentTypeId();

  @XmlElement(name = "templateId")
  public final ArrayList<TemplateId> templateIds = new ArrayList<>();

  @XmlElement
  public final RecordTarget recordTarget = new RecordTarget();
  @XmlElement(name = "participant")
  public final List<NextOfKin> participants = new ArrayList<>();

  public ClinicalDocument(){
    templateIds.add(ClinicalDocumentTemplateId);
  }

  public void setPatient(Patient patient){
    this.recordTarget.patientRole.patient = patient;
  }

  public void setPatientAddress(Address address)
  {
    this.recordTarget.patientRole.address = address;
  }

  public void setPatientTelecoms(List<Telecom> telecoms) {
    this.recordTarget.patientRole.telecoms = telecoms;
  }

  public void setIds(PatientId patientId, PatientId patientId1, MedicareId medicareId) {
    this.recordTarget.patientRole.patientIds = asList(patientId, patientId1);
    this.recordTarget.patientRole.medicareId = medicareId;
  }

  public void setNok(Name name) {
    this.participants.add(new NextOfKin(name));
  }

  public void addGuarantor(Name name, Telecom telecom, Address address) {
    this.participants.add(new Guarantor(name, telecom, address));
  }
}
