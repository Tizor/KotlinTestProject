package app.dao

import app.domain.CreditOffer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CreditOfferRepo : JpaRepository<CreditOffer, UUID> {
}
