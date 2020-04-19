package clinical.document;

import clinical.document.ccd.AddressBuilder;
import clinical.document.header.*;
import clinical.document.header.PatientId;
import clinical.document.model.CareTeamModel;
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
  public RecordTarget recordTarget = new RecordTarget();
  @XmlElement(name = "participant")
  public final List<Participant> participants = new ArrayList<>();

  public ClinicalDocument(){
    templateIds.add(ClinicalDocumentTemplateId);
  }

  public void setParticipant(Participant participant) {
    this.participants.add(participant);
  }
}
