package app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration


@SpringBootApplication(exclude = [HibernateJpaAutoConfiguration::class])
open class App

    fun main(args: Array<String>) {
        SpringApplication.run(App::class.java, *args)
    }


