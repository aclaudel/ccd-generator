package clinical.document.ccd;

import clinical.document.header.Address;
import clinical.document.model.AddressModel;

public class AddressBuilderImpl implements AddressBuilder {
    public String use;
    private AddressModel addressModel;


    public Address buildAddress() {
        Address address = new Address();
        address.use = this.use;
        address.streetAddressLine1 = this.addressModel.streetAddress1;
        address.streetAddressLine2 = this.addressModel.streetAddress2;
        address.city = this.addressModel.city;
        address.state = this.addressModel.state;
        address.postalCode = this.addressModel.postalCode;
        return address;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public void setAddressModel(AddressModel addressModel) {
        this.addressModel = addressModel;
    }
}
