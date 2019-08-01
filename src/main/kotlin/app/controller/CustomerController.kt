package app.controller

import app.domain.Customer
import app.service.CustomerService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val customerService: CustomerService) {

    @GetMapping
    fun getAll() = customerService.getAllCustomer()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: UUID) = customerService.getCustomerById(id)

    @PostMapping
    fun createCustomer(@RequestBody customer: Customer) = customerService.addCustomer(customer)

    @PutMapping("/{id}")
    fun updateCustomer(@PathVariable id: UUID, @RequestBody customer: Customer) =
        customerService.updateCustomer(id, customer)

    @DeleteMapping("/{id}")
    fun deleteCustomer(@PathVariable id: UUID) = customerService.deleteCustomer(id)

//    @GetMapping
//    fun getCustomerCredits

}