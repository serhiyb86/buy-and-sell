package com.vm.buyandsell.controller

import com.vm.buyandsell.dto.MooveDocConverter
import com.vm.buyandsell.dto.MooveDocDTO
import com.vm.buyandsell.model.doc.MooveDoc
import com.vm.buyandsell.repository.MooveDocRepository
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class GreetingController (private val mooveRepository: MooveDocRepository,
    private val mooveDocConverter: MooveDocConverter){

    @QueryMapping
    fun hello(): String {
        return "Hello, GraphQL!"
    }

    @QueryMapping
    fun mooveDocs(): List<MooveDocDTO> {
return mooveRepository.findAll().map { mooveDoc ->  mooveDocConverter.toDTO(mooveDoc)}
    }

}