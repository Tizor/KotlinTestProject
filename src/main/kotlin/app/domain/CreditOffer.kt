package app.domain

import java.util.*
import javax.persistence.*


@Entity
@Table(name = "credit_offer")
data class CreditOffer(

    @Id
    @Column(name = "id")
    @GeneratedValue
    private val id: UUID? = null,

    @Column(name = "amount")
    private val amount: Long? = 0L,

    @Column(name = "percent")
    private val percent: Double = 0.0,

    @Column(name = "duration")
    private val durationInDays: Int = 0,

    @Column(name = "name")
    private val name: String = ""
)