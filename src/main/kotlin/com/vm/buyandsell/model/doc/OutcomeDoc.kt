package com.vm.buyandsell.model.doc

import com.vm.buyandsell.model.Employee
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne
import lombok.Data
import java.time.LocalDateTime

@Entity
@DiscriminatorValue("OUTCOME")
class OutcomeDoc(
    id: Long,
    counterParty: CounterParty,
    docDate: LocalDateTime,
    innerDocNumber: Int,
    priceType: PriceType,
    payType: PayType,
    vat: VatType,
    comment: String,
    warehouse: Warehouse,
    cashier: Employee,
    goodsOrServices: List<GoodOrService>,
    val supplierDocNumber: String
) : MooveDoc(id, counterParty, docDate, innerDocNumber, priceType, payType, vat, comment, warehouse, cashier, goodsOrServices) {

}