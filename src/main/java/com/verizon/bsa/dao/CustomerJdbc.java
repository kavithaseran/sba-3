package com.verizon.bsa.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.verizon.bsa.model.Customer;

@Repository
public class CustomerJdbc implements CustomerDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public CustomerJdbc(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public Customer addEmployee(Customer customer) {
		int count=jdbcTemplate.update(IQueryMapper.Insert_Employee,
				customer.getCustomerId(),
				customer.getName(),
				customer.getDateOfJoining(),
				customer.getCity(),
				customer.getContact()
				);
		
		if(count<1) {
			customer=null;
		}
		
		return customer;
	}

	@Override
	public List<Customer> getAllEmployees() {
		List<Customer> employees= jdbcTemplate.query(
				IQueryMapper.Get_All_Employees,
				new CustomerRowMapper());
		
		return employees;
	}


}
