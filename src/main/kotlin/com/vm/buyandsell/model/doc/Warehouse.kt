package com.vm.buyandsell.model.doc

import jakarta.persistence.*

@Entity
@Table(name = "warehouse")
data class Warehouse(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Int,
    @Column(name = "warehouseName")
    var warehouseName: String
)
