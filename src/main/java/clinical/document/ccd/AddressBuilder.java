package clinical.document.ccd;

import clinical.document.header.Address;
import clinical.document.model.AddressModel;

public interface AddressBuilder {
    void setUse(String use);

    void setAddressModel(AddressModel addressModel);

    Address buildAddress();

}
