package com.vm.buyandsell.repository

import com.vm.buyandsell.model.doc.Street
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface StreetRepository: JpaRepository<Street, Int> {
    fun findFirstByStreet(street: String)
    fun findFirstByStreetIgnoreCase(street: String): Optional<Street>
}