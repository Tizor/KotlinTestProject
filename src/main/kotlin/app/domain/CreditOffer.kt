package app.domain

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "credit_offer")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class CreditOffer(

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: UUID? = null,

    @JsonProperty("name")
    @Column(name = "name_of_credit_offer")
    private val name: String = "",

    @JsonProperty("amount")
    @Column(name = "amount_of_money")
    private val amount: Long? = 0L,

    @JsonProperty("percent")
    @Column(name = "percent")
    private val percent: Double = 0.0,

    @JsonProperty("duration")
    @Column(name = "duration_in_days")
    private val durationInDays: Int = 0

)
