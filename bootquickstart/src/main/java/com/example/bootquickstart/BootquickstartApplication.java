package com.example.bootquickstart;

import com.example.bootquickstart.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class BootquickstartApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(BootquickstartApplication.class, args);
        Book hfj = ctx.getBean(Book.class);
        log.info(hfj.toString());
    }

    @Bean
    public Book book(){
        return new Book(101,"Head First Java");
    }

}
