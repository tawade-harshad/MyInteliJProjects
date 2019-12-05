package com.example.demo.controller;

import com.example.demo.entity.LoanCustomer;
import com.example.demo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(value = "*")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService service;

    @Autowired
    private Environment env;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping(value="/customer")
    public Iterable<LoanCustomer> findAll(){
        return this.service.findAll();
    }

    @GetMapping(value = "/port")
    public String getPort(){
        String portNumber = env.getProperty("local.server.port");
        return portNumber + instanceId;
    }


    @GetMapping(value = "/customer/sort/{propName}")
    public Iterable<LoanCustomer> showSortBy(@PathVariable("propName") String propName){
        String portNumber = env.getProperty("local.server.port");
        log.info("Request Handeled by application in " +portNumber);
        return this.service.sortyBy(propName);
    }

    @GetMapping("/customer/paginate/{pageNo}/{size}/{propName}")
    public Page<LoanCustomer> paginate(@PathVariable("pageNo") int pageNo,
                                       @PathVariable("size") int size,
                                       @PathVariable("propName") String propName){
        return this.service.paginate(pageNo,size, propName);
    }

    @PostMapping(value = "/customer", produces = "application/json", consumes = "application/json" )
    public LoanCustomer addLoan(@RequestBody LoanCustomer newLoan){
        return this.service.addLoan(newLoan);
    }
}
