package com.vm.buyandsell.model.doc

import jakarta.persistence.*
import java.io.Serializable

@Table(name = "city")
@Entity
data class City (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    val id: Int,
    @Column(name = "city")
    var cityName: String
) {

}
