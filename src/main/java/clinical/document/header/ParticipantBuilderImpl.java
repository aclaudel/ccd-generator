package clinical.document.header;

import clinical.document.ccd.AddressBuilder;
import clinical.document.model.PersonModel;
import clinical.document.shared.Telecom;

public class ParticipantBuilderImpl implements ParticipantBuilder {
    private String classCode;
    private PersonModel person;
    private final AddressBuilder addressBuilder;

    public ParticipantBuilderImpl(AddressBuilder addressBuilder) {
        this.addressBuilder = addressBuilder;
    }

    @Override
    public void setClass(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public void setPersonModel(PersonModel person) {
        this.person = person;
    }

    @Override
    public Participant buildParticipant() {
        Participant participant = new Participant();
        participant.associatedEntity = new AssociatedEntity();
        participant.associatedEntity.classCode = classCode;
        participant.associatedEntity.associatedPerson = new AssociatedPerson(new Name(person.given, person.family));
        if(person.address != null)
        {
            addressBuilder.setAddressModel(person.address);
            participant.associatedEntity.address = addressBuilder.buildAddress();
        }

        if(person.phone != null){
            Telecom telecom = new Telecom();
            telecom.value =person.phone;
            participant.associatedEntity.telecom = telecom;
        }

        return participant;
    }
}
