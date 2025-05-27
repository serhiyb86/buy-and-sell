package com.vm.buyandsell.model.doc

import com.vm.buyandsell.model.Employee
import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity
import java.time.LocalDateTime

@Entity
@DiscriminatorValue("INVOICE")
class Invoice (
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
    goodsOrServices: List<GoodOrService>
) : MooveDoc(id, counterParty, docDate, innerDocNumber, priceType, payType, vat, comment, warehouse, cashier, goodsOrServices) {

}