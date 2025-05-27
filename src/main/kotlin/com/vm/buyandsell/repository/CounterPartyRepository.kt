package com.vm.buyandsell.repository

import com.vm.buyandsell.model.doc.CounterParty
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "cparty")
interface CounterPartyRepository: JpaRepository<CounterParty, Int> {
}