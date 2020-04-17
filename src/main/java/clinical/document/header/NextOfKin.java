package clinical.document.header;

public class NextOfKin extends Participant {
    public NextOfKin(Name name) {
        super(new AssociatedEntity("NOK", name));
    }
}
