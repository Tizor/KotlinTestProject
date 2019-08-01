package app.config

import org.hibernate.cfg.Environment
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.jdbc.datasource.DriverManagerDataSource
import org.springframework.orm.hibernate5.LocalSessionFactoryBean
import org.springframework.transaction.annotation.EnableTransactionManagement
import java.util.*
import javax.sql.DataSource


@Configuration
@EnableTransactionManagement
open class HibernateConfig {

    @Bean
    open fun getDataSource(): DataSource {
        val driverManager = DriverManagerDataSource()
        driverManager.setDriverClassName("org.postgresql.Driver")
        driverManager.url = "jdbc:postgresql://localhost:5432/test"
        driverManager.username = ""
        driverManager.password = ""
        return driverManager
    }

    @Bean
    open fun getSessionFactoryBean(): LocalSessionFactoryBean {

        val localSessionFactoryBean = LocalSessionFactoryBean()
        localSessionFactoryBean.setDataSource(getDataSource())

        val hibernateProperties = Properties()
        hibernateProperties.setProperty(Environment.DIALECT, "org.hibernate.dialect.PostgreSQL10Dialect")
        hibernateProperties.setProperty(Environment.SHOW_SQL, "true")
        hibernateProperties.setProperty(Environment.FORMAT_SQL, "true")
//        localSessionFactoryBean.hibernateProperties = hibernateProperties // Kotlin version
        localSessionFactoryBean.setHibernateProperties(hibernateProperties);
        localSessionFactoryBean.setAnnotatedClasses() //add classes
        return localSessionFactoryBean


    }

}