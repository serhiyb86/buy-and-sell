package com.vm.buyandsell.model.doc

import jakarta.persistence.*

@Entity
@Table(name = "counterparty")
data class CounterParty(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val shortName: String,
    val fullName: String,
    val inn: String,
    val EDRPOU: String,
    val vatRegNumber: String,
    val phoneNumber: String,
    val type: CounterPartyType,
    @ManyToOne(targetEntity = PersonAddress::class, cascade = [CascadeType.ALL])
    val address: PersonAddress
) {

}
