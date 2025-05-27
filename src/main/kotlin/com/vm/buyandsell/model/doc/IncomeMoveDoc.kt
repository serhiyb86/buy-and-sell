package com.vm.buyandsell.model.doc

import com.vm.buyandsell.model.Employee
import jakarta.persistence.*
import lombok.Data
import java.time.LocalDateTime

@Entity
@DiscriminatorValue("INCOME")
open class IncomeMoveDoc(
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
    open var supplierDocNumber: String
) : MooveDoc(id, counterParty, docDate, innerDocNumber, priceType, payType, vat, comment, warehouse, cashier, goodsOrServices) {

}
