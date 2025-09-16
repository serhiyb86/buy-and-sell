package com.vm.buyandsell.service;

import com.vm.buyandsell.dto.CounterPartyInput;
import com.vm.buyandsell.dto.PersonAddressInput;
import com.vm.buyandsell.model.doc.CounterParty;
import com.vm.buyandsell.model.doc.PersonAddress;
import com.vm.buyandsell.repository.CounterPartyRepository;
import org.springframework.stereotype.Service;

@Service
public class CounterPartyServiceImpl implements CounterPartyService {

    private final CounterPartyRepository counterPartyRepository;
    private final AddressService addressService;

    public CounterPartyServiceImpl(CounterPartyRepository counterPartyRepository, AddressService addressService) {

        this.counterPartyRepository = counterPartyRepository;
        this.addressService = addressService;
    }


    public CounterParty addCounterParty(CounterPartyInput input) {
        PersonAddressInput addressInput = input.getAddress();
        PersonAddress personAddress = addressService.addPersonAddress(addressInput);

        return counterPartyRepository.save(
                new CounterParty(0,
                        input.getShortName(),
                        input.getFullName(),
                        input.getInn(),
                        input.getEDRPOU(),
                        input.getVatRegNumber(),
                        input.getPhoneNumber(),
                        input.getType(),
                        personAddress
                )
        );
    }

}
