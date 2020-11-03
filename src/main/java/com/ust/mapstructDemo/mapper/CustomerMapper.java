/*
 *  19-Oct-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */
package com.ust.mapstructDemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ust.mapstructDemo.model.Customer;
import com.ust.mapstructDemo.vo.CustomerVO;

/**
 * The Interface CustomerMapper.
 */
@Mapper(componentModel = "spring")
public interface CustomerMapper {

    /**
     * Customer list to customer VO list.
     *
     * @param customers the customers
     * @return the list
     */
    List<CustomerVO> CustomerListToCustomerVOList(List<Customer> customers);

    // @Mapping(target = "address.town",source = "address.city")
    // @Mapping(target = "state22",source = "state")
    /**
     * Customer to customer VO.
     *
     * @param customer the customer
     * @return the customer VO
     */
    // @Mapping(target = "state",ignore = true)
    CustomerVO CustomerToCustomerVO(Customer customer);

    /**
     * Customer VO to customer.
     *
     * @param customerVO the customer VO
     * @return the customer
     */
    // @Mapping(target = "address.city",source = "addressVO.town")
    Customer CustomerVOToCustomer(CustomerVO customerVO);

}
