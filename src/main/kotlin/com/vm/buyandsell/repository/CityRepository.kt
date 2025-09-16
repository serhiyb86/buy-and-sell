package com.vm.buyandsell.repository

import com.vm.buyandsell.model.doc.City
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface CityRepository: JpaRepository<City, Int> {
    fun findFirstByCityNameIgnoreCase(inputCity: String): Optional<City>
}