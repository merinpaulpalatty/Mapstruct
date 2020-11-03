package com.ust.mapstructDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.mapstructDemo.mapper.CustomerMapper;
import com.ust.mapstructDemo.model.Customer;
import com.ust.mapstructDemo.repository.CustomerRepository;
import com.ust.mapstructDemo.vo.CustomerVO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerMapper customerMapper;

	// for saving customer
	public boolean saveCustomer(CustomerVO vo) {
		Customer customer = entityConverter(vo); // normal
		customerRepository.save(customer);
		return true;

	}

	// for retreiving customers
	public List<CustomerVO> getAllCustomers() {
		List<Customer> customers = customerRepository.findAll();
		return voConverter(customers); // normal
		// return customerMapper.CustomerListToCustomerVOList(customers);
	}

	// to get one customer based on id
	public CustomerVO getCustomer(long id) {
			Customer customer = customerRepository.findById(id).get();
			return customerVOConverter(customer); // normal
			// customerMapper.CustomerToCustomerVO(customer); //mapstruct
	}

	private List<CustomerVO> voConverter(List<Customer> customers) {
		List<CustomerVO> VOs = new ArrayList<>();

		for (Customer customer : customers) {
			CustomerVO vo = customerVOConverter(customer); // normal
			// CustomerVO vo = customerMapper.CustomerToCustomerVO(customer); //mapstruct
			VOs.add(vo);
		}
		return VOs;
	}

	private CustomerVO customerVOConverter(Customer customer) {
		CustomerVO vo = new CustomerVO();
		vo.setCustomerId(customer.getCustomerId());
		vo.setAge(customer.getAge());
		vo.setAlternateMobile(customer.getAlternateMobile());
		vo.setCity(customer.getCity());
		vo.setEmail(customer.getEmail());
		vo.setFirstName(customer.getFirstName());
		vo.setGender(customer.getGender());
		vo.setLandline(customer.getLandline());
		vo.setLastName(customer.getLastName());
		vo.setMobile(customer.getMobile());
		vo.setState(customer.getState());
		return vo;
	}

	private Customer entityConverter(CustomerVO vo) {
		Customer customer = new Customer();
		customer.setAge(vo.getAge());
		customer.setAlternateMobile(vo.getAlternateMobile());
		customer.setCity(vo.getCity());
		customer.setEmail(vo.getEmail());
		customer.setFirstName(vo.getFirstName());
		customer.setGender(vo.getGender());
		customer.setLandline(vo.getLandline());
		customer.setLastName(vo.getLastName());
		customer.setMobile(vo.getMobile());
		customer.setState(vo.getState());
		return customer;
	}

}
