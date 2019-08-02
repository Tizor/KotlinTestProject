package app.domain

import com.fasterxml.jackson.annotation.JsonAutoDetect
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*
import javax.persistence.*

//

@Entity
@Table(name = "customer")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
data class Customer(

    @Id
    @JsonProperty("id")
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: UUID? = null,

    @JsonProperty("email")
    @Column(name = "email")
    private val email: String = "",

    @JsonProperty("name")
    @Column(name = "name")
    private val name: String = "",

    @JsonProperty("address")
    @Column(name = "address")
    private val address: String = ""

)