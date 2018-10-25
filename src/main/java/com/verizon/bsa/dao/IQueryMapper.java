package com.verizon.bsa.dao;

public interface IQueryMapper {
	
	public static final String Insert_Employee =
			"INSERT INTO customers VALUES(?,?,?,?,?)";
	public static final String Get_All_Employees =
			"SELECT * FROM customers";

}
