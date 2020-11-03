package com.ust.mapstructDemo.service;

import java.util.List;

import com.ust.mapstructDemo.vo.CustomerVO;

public interface CustomerService {

	boolean saveCustomer(CustomerVO vo);

	List<CustomerVO> getAllCustomers();

	CustomerVO getCustomer(long id);

}
