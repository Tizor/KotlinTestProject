package app.service

import app.dao.CreditOfferRepo
import app.domain.CreditOffer
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
open class CreditOfferService(private val creditOfferRepo: CreditOfferRepo) {

    @Transactional
    open fun createCreditOffer(creditOffer: CreditOffer): CreditOffer = creditOfferRepo.save(creditOffer)

    @Transactional
    open fun updateCreditOffer(id: UUID, creditOffer: CreditOffer): CreditOffer =
        creditOfferRepo.save(creditOffer.copy(id = id))

    @Transactional
    open fun deleteCreditOffer(id: UUID): CreditOffer = creditOfferRepo.getOne(id)

    @Transactional
    open fun getAllCreditOffer(): Collection<CreditOffer> = creditOfferRepo.findAll()
}