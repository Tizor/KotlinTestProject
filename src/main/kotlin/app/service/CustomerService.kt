package app.service

import app.dao.CustomerRepo
import app.domain.Customer
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional


@Service
open class CustomerService(private val customerRepo: CustomerRepo) {

    @Transactional
    open fun getAllCustomer(): Iterable<Customer> = customerRepo.findAll()

    @Transactional
    open fun getCustomerById(id: UUID): Customer = customerRepo.getOne(id)

    @Transactional
    open fun addCustomer(customer: Customer): Customer = customerRepo.save(customer)

    @Transactional
    open fun updateCustomer(id: UUID, customer: Customer): Customer = customerRepo.save(customer.copy(id = id))

    @Transactional
    open fun deleteCustomer(id: UUID) = customerRepo.deleteById(id)

//    fun getCustomerCredits(customerId: UUID): Iterable<Credit> = customerRepo.getCredits(customerId)

}