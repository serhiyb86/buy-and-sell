package com.vm.buyandsell.repository

import com.vm.buyandsell.model.doc.PersonAddress
import org.springframework.data.jpa.repository.JpaRepository

interface PersonAddressRepository: JpaRepository<PersonAddress, Int> {
}