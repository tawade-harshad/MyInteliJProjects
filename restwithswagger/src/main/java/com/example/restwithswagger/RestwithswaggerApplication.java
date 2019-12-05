package com.example.restwithswagger;

import com.example.restwithswagger.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Logger;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableSwagger2
@EnableWebSecurity
public class RestwithswaggerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(RestwithswaggerApplication.class, args);
        Book hfj = ctx.getBean(Book.class);
//        log.info(hfj.toString());
    }
}
