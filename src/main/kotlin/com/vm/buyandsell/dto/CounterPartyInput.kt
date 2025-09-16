package com.vm.buyandsell.dto

import com.vm.buyandsell.model.doc.CounterPartyType

data class CounterPartyInput(
    var id: Int,
    var shortName: String,
    var fullName: String,
    var inn: String,
    var EDRPOU: String,
    var vatRegNumber: String,
    var phoneNumber: String,
    var type: CounterPartyType,
    var address: PersonAddressInput
)
