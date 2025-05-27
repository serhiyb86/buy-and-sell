package com.vm.buyandsell.model.doc

import jakarta.persistence.*
import lombok.Data
import java.io.Serializable


@Table(name = "street")
@Entity
data class Street(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val street: String
) {

}
