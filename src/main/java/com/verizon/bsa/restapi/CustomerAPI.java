/*This is to make some changes*/
/*This is done from local system*/

package com.verizon.bsa.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.bsa.model.Customer;
import com.verizon.bsa.service.CustomerService;

@RestController
public class CustomerAPI {
	@Autowired
	private CustomerService employeeservice;

	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> listEmployeesAction() {
		return new ResponseEntity<List<Customer>>(employeeservice.getAllEmployees(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Customer> addEmployeeAction(@RequestBody Customer employee) {
		ResponseEntity<Customer> resp = null;
		employee = employeeservice.addEmployee(employee);

		if (employee != null)
			resp = new ResponseEntity<>(employee, HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return resp;
	}

}
