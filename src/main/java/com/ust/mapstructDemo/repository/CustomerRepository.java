package com.ust.mapstructDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.mapstructDemo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, java.lang.Long>{

}
