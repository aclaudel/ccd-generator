package clinical.document.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PatientModel {
    public final String prefix = "Mr";
    public final String family = "Newman";
    public final String suffix = "III";
    public final String[] givens = new String[] {"Christopher", "Frank"};
    public final String gender = "F";
    public final LocalDate birthDate = LocalDate.of(1975,5,1);
    public final String language = "en";
    public final RaceModel race = new RaceModel("1002-5", "American Indian or Alaska Native");
    public final List<RaceModel> additionalRaces = Arrays.asList(new RaceModel("1010-8", "Apache"));
    public final EthnicGroupModel ethnicGroup = new EthnicGroupModel("2135-2", "Hispanic or Latino");
    public final List<EthnicGroupModel> additionalEthnicGroups = Arrays.asList(new EthnicGroupModel("2144-4", "Valencian"));
}
