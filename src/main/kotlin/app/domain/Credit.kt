package app.domain

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "credit")
data class Credit(

    @Id
    @GeneratedValue
    @Column(name = "id")
    private val id: UUID? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_offer")
    private val creditOffer: CreditOffer? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer")
    private val customer: Customer? = null,

    @Column(name = "request_date")
    private val requestDate: LocalDateTime? = null,

    @Column(name = "decision_date")
    private val decisionDate: LocalDateTime? = null,

    @Column(name = "debt")
    private val debt: Long = 0L,

    @Column(name = "payment_status")
    private val paymentStatus: Boolean = false,

    @Column(name = "min_contribution")
    private val minContribution: Double = 0.0

)
