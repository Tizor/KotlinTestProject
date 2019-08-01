package app.dao

import app.domain.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CustomerRepo : JpaRepository<Customer, UUID> {
//    fun getCustomerCredits(customerId: UUID): Collection<Credit>
}