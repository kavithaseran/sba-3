package com.verizon.bsa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.bsa.dao.CustomerDao;
import com.verizon.bsa.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao employeeDao;

	@Override
	public Customer addEmployee(Customer employee) {
		return employeeDao.addEmployee(employee);
	}

	@Override
	public List<Customer> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

}
