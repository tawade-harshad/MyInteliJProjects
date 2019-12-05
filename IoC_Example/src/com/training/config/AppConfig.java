package com.training.config;

import com.training.beans.Hospital;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    // Default is SINGLETON, we can change scope to PROTOTYPE using @Scope annotation.
//    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    // Spring Beans are created EAGERLY by Default and can be made Lazy by adding @Lazy annotation.

    //This is using Setter Dependency Injection
    @Lazy
    public Hospital leelavathi(){

        Hospital leela = new Hospital();
        leela.setHospitalCode(1020);
        leela.setHospitalName("Leelavathi Hospital");
        leela.setMobileNumber(949495920);

        return leela;
    }

    //This is using Constructor Dependency Injection

    @Bean
    public Hospital apollo(){
        return new Hospital(10404, "Apollo Hospital", 9811198222L);
    }
}
