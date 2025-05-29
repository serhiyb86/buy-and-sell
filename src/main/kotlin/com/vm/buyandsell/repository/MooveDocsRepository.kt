package com.vm.buyandsell.repository

import com.vm.buyandsell.model.doc.CounterParty
import com.vm.buyandsell.model.doc.MooveDoc
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "moovedoc")
interface MooveDocsRepository: JpaRepository<MooveDoc, Int> {
}