package com.verizon.bsa.service;

import java.util.List;

import com.verizon.bsa.model.Customer;

public interface CustomerService {
	Customer addEmployee(Customer employee);
	List<Customer> getAllEmployees();
}
