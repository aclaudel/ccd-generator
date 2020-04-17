package clinical.document.model;

import clinical.document.header.Address;

import java.util.Optional;

public class PersonModel {
    public final String given;
    public final String family;
    public final String phone;
    public final AddressModel address;

    public PersonModel(String given, String family, String phone, AddressModel address) {
        this.given = given;
        this.family = family;
        this.phone = phone;
        this.address = address;
    }

    public PersonModel(String given, String family, String phone) {
        this(given, family, phone, null);
    }

    public PersonModel(String given, String family) {
        this(given, family, null, null);
    }
}
