
/*
 *
 */
package com.ust.mapstructDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.mapstructDemo.service.CustomerService;
import com.ust.mapstructDemo.vo.CustomerVO;

/**
 * The Class CustomerController.
 */
@RestController
public class CustomerController {

    /** The customer service. */
    @Autowired
    private CustomerService customerService;

    /**
     * Gets the all customers.
     *
     * @return the all customers
     */
    @GetMapping
    public ResponseEntity<List<CustomerVO>> getAllCustomers() {
        final List<CustomerVO> customerVOs = customerService.getAllCustomers();
        return new ResponseEntity<>(customerVOs, HttpStatus.OK);
    }

    /**
     * Gets the customer.
     *
     * @param id the id
     * @return the customer
     */
    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<CustomerVO> getCustomer(@PathVariable long id) {
        final CustomerVO customerVO = customerService.getCustomer(id);
        return new ResponseEntity<>(customerVO, HttpStatus.OK);
    }

    /**
     * Save customer.
     *
     * @param vo the vo
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody CustomerVO vo) {
        if (customerService.saveCustomer(vo)) {
            return new ResponseEntity<>("successfully saved", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
