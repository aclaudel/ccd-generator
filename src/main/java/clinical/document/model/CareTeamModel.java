package clinical.document.model;

public class CareTeamModel {
    public final PersonModel nok;
    public final PersonModel guarantor;

    public CareTeamModel(PersonModel nok, PersonModel guarantor) {
        this.nok = nok;
        this.guarantor = guarantor;
    }
}
