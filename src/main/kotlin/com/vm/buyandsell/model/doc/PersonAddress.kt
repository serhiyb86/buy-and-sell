package com.vm.buyandsell.model.doc

import jakarta.persistence.*


@Entity
@Table(name = "person_address")
data class PersonAddress(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @ManyToOne
    val street: Street?,
    @ManyToOne
    val city: City?,
    val zip: String
    ) {

}
