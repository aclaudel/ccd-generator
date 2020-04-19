package clinical.document.header;

import clinical.document.model.PersonModel;

public interface ParticipantBuilder {
    void setClass(String classCode);

    void setPersonModel(PersonModel person);

    Participant buildParticipant();
}
