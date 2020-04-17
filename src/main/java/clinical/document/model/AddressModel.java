package clinical.document.model;

public class AddressModel {

    public final String streetAddress1;
    public final String streetAddress2;
    public final String city;
    public final String state;
    public final String postalCode;

    public AddressModel(String streetAddress1, String streetAddress2,
                        String city, String state, String postalCode) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }
}
