package com.vm.buyandsell.controller

import com.vm.buyandsell.dto.CounterPartyInput
import com.vm.buyandsell.dto.MooveDocConverter
import com.vm.buyandsell.dto.MooveDocDTO
import com.vm.buyandsell.model.doc.CounterParty
import com.vm.buyandsell.model.doc.MooveDoc
import com.vm.buyandsell.repository.CounterPartyRepository
import com.vm.buyandsell.repository.MooveDocRepository
import com.vm.buyandsell.service.CounterPartyService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class GreetingController (private val mooveRepository: MooveDocRepository,
                          private val counterPartyService: CounterPartyService,
                          private val mooveDocConverter: MooveDocConverter){

    @QueryMapping
    fun hello(): String {
        return "Hello, GraphQL!"
    }

    @QueryMapping
    fun mooveDocs(): List<MooveDocDTO> {
return mooveRepository.findAll().map { mooveDoc ->  mooveDocConverter.toDTO(mooveDoc)}
    }

    @MutationMapping
    fun addCounterParty(@Argument("cp") cp: CounterPartyInput): CounterParty {
        return counterPartyService.addCounterParty(cp);
    }

}