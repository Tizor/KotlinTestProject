package app.domain

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "customer")
data class Customer(

    @Id
    @Column(name = "id")
    @GeneratedValue
    private val id: UUID? = null,

    @Column(name = "email")
    private val email: String = "",

    @Column(name = "name")
    private val name: String = "",

    @Column(name = "address")
    private val address: String = ""

)