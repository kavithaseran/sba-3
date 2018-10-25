package com.verizon.bsa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.verizon.bsa.model.Customer;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		
		customer.setCustomerId(rs.getString(1));
		customer.setName(rs.getString(2));
		customer.setDateOfJoining(rs.getDate(3));
		customer.setCity(rs.getString(4));
		customer.setContact(rs.getString(5));
		
		return customer;
	}

}
