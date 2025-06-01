package com.vm.buyandsell.dto

import com.vm.buyandsell.model.Employee
import com.vm.buyandsell.model.doc.CounterParty
import com.vm.buyandsell.model.doc.DocType
import com.vm.buyandsell.model.doc.GoodOrService
import com.vm.buyandsell.model.doc.PayType
import com.vm.buyandsell.model.doc.PriceType
import com.vm.buyandsell.model.doc.VatType
import com.vm.buyandsell.model.doc.Warehouse
import jakarta.persistence.*
import lombok.Data
import java.time.LocalDateTime

@Data
data class MooveDocDTO(

    open var id: Long,
    open var doctype: DocType,
    open var counterParty: CounterParty,
    open var docDate: String,
    open var innerDocNumber: Int,
    open var priceType: PriceType,
    open var payType: PayType,
    open var vat: VatType,
    open var comment: String,
    open var warehouse: Warehouse,
    open var cashier: Employee,
    open var goodsOrServices: List<GoodOrService>

) {
}