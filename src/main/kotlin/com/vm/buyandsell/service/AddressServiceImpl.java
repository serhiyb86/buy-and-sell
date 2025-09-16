package com.vm.buyandsell.service;

import com.vm.buyandsell.dto.PersonAddressInput;
import com.vm.buyandsell.model.doc.City;
import com.vm.buyandsell.model.doc.PersonAddress;
import com.vm.buyandsell.model.doc.Street;
import com.vm.buyandsell.repository.CityRepository;
import com.vm.buyandsell.repository.PersonAddressRepository;
import com.vm.buyandsell.repository.StreetRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    private final PersonAddressRepository personAddressRepository;
    private final CityRepository cityRepository;
    private final StreetRepository streetRepository;

    public AddressServiceImpl(PersonAddressRepository personAddressRepository, CityRepository cityRepository, StreetRepository streetRepository) {
        this.personAddressRepository = personAddressRepository;
        this.cityRepository = cityRepository;
        this.streetRepository = streetRepository;
    }


    @Override
    public PersonAddress addPersonAddress(PersonAddressInput input) {
        //check if street exist
        Optional<Street> street = streetRepository.findFirstByStreetIgnoreCase(input.getStreet());
        Street savedStreet;
        savedStreet = street.orElseGet(() -> streetRepository.save(new Street(0, input.getStreet())));

        Optional<City> city = cityRepository.findFirstByCityNameIgnoreCase(input.getCity());
        City savedCity;
        savedCity = city.orElseGet(() -> cityRepository.save(new City(0, input.getCity())));

        PersonAddress personAddress = new PersonAddress(0,
                savedStreet,
                savedCity,
                input.getZip());

        return personAddressRepository.save(personAddress);
    }
}
