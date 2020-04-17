package clinical.document;

import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.model.PatientModel;
import clinical.document.model.PersonModel;
import clinical.document.shared.Telecom;

import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.Arrays;
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
  public final List<Participant> participants = new ArrayList<>();

  public ClinicalDocument(){
    templateIds.add(ClinicalDocumentTemplateId);
  }

  public void setPatient(PatientModel patientModel){
    this.recordTarget.patientRole.patient = new Patient(patientModel);
    this.recordTarget.patientRole.telecoms = Arrays.asList(
            new Telecom("HP", patientModel.homePhone),
            new Telecom("MC", patientModel.mobilePhone),
            new Telecom(patientModel.email)
    );
    this.recordTarget.patientRole.address = new Address("HP", patientModel.address);
  }


  public void setIds(PatientId patientId, PatientId patientId1, MedicareId medicareId) {
    this.recordTarget.patientRole.patientIds = asList(patientId, patientId1);
    this.recordTarget.patientRole.medicareId = medicareId;
  }

  public void setNok(PersonModel nokModel) {
    this.participants.add(new NextOfKin(new Name(nokModel.given, nokModel.family)));
  }

  public void addGuarantor(Name name, Telecom telecom, Address address) {
    this.participants.add(new Guarantor(name, telecom, address));
  }
}
