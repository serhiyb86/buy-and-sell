package com.vm.buyandsell.service;

import com.vm.buyandsell.dto.PersonAddressInput;
import com.vm.buyandsell.model.doc.PersonAddress;

public interface AddressService {

    PersonAddress addPersonAddress(PersonAddressInput input);
}
