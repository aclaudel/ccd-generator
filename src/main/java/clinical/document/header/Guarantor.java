package clinical.document.header;

import clinical.document.shared.Telecom;

public class Guarantor extends Participant {
    public Guarantor(Name name, Telecom telecom, Address address) {
        super(new AssociatedEntity("GUAR", name, telecom, address));
    }
}
