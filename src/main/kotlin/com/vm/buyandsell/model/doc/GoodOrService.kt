package com.vm.buyandsell.model.doc

import jakarta.persistence.*

@Entity
@Table(name = "goodservice")
data class GoodOrService(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val barCode: String,
)
