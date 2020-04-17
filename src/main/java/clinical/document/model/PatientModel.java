package clinical.document.model;

import clinical.document.header.RaceCode;
import clinical.document.shared.EthnicGroup;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PatientModel {

    public String prefix = "Mr";
    public String family = "Newman";
    public String suffix = "III";
    public String[] givens = new String[] {"Christopher", "Frank"};
    public String gender = "F";
    public LocalDate birthDate = LocalDate.of(1975,5,1);
    public String language = "en";
    public RaceModel race = new RaceModel("1002-5", "American Indian or Alaska Native");
    public List<RaceModel> additionalRaces = Arrays.asList(new RaceModel("1010-8", "Apache"));
    public EthnicGroupModel ethnicGroup = new EthnicGroupModel("2135-2", "Hispanic or Latino");
    public List<EthnicGroupModel> additionalEthnicGroups = Arrays.asList(new EthnicGroupModel("2144-4", "Valencian"));
}
