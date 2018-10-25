package com.verizon.bsa.dao;

import java.util.List;

import com.verizon.bsa.model.Customer;

public interface CustomerDao {

	Customer addEmployee(Customer employee);
	List<Customer> getAllEmployees();
	
}
