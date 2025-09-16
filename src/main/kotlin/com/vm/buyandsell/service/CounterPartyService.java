package com.vm.buyandsell.service;

import com.vm.buyandsell.dto.CounterPartyInput;
import com.vm.buyandsell.model.doc.CounterParty;
import org.springframework.stereotype.Service;

@Service
public interface CounterPartyService {

    CounterParty addCounterParty (CounterPartyInput input);
}
