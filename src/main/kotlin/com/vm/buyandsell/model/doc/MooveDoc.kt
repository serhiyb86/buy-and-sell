package com.vm.buyandsell.model.doc

import com.vm.buyandsell.model.Employee
import jakarta.persistence.*
import lombok.Data
import java.time.LocalDateTime

@Entity
@Table(name = "moove_doc")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "doctype")
@Data
abstract class MooveDoc(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long,
    @ManyToOne(fetch = FetchType.EAGER)
    open var counterParty: CounterParty,
    open var docDate: LocalDateTime,
    open var innerDocNumber: String,
    open var priceType: PriceType,
    open var payType: PayType,
    open var vat: VatType,
    open var comment: String,
    @ManyToOne
    open var warehouse: Warehouse,
    @ManyToOne
    open var cashier: Employee,
    @OneToMany
    open var goodsOrServices: List<GoodOrService>

) {
}