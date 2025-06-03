package com.vm.buyandsell.dto

import com.vm.buyandsell.model.doc.DocType
import com.vm.buyandsell.model.doc.MooveDoc
import org.springframework.stereotype.Service

@Service
class MooveDocConverter {

    fun toDTO(mooveDoc: MooveDoc): MooveDocDTO {
        return MooveDocDTO(
            mooveDoc.id,
            DocType.INCOME,
            mooveDoc.counterParty,
            mooveDoc.docDate.toString(),
            mooveDoc.innerDocNumber,
            mooveDoc.priceType,
            mooveDoc.payType,
            mooveDoc.vat,
            mooveDoc.comment,
            mooveDoc.warehouse,
            mooveDoc.cashier,
            mooveDoc.goodsOrServices
        )
    }
}
