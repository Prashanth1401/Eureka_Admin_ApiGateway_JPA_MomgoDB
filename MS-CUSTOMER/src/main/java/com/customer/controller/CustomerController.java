package com.customer.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@RestController
@RequestMapping("/JPA")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
@PostMapping("/post")
	public void saveCustomerDetails(@RequestBody Customer customer) {
		customerRepository.save(customer);
		
	}

@GetMapping("/Get")
public List<Customer> GetAllCustomerDetails(@RequestBody Customer customer){
	List<Customer> cm=(List<Customer>) customerRepository.findAll();
	System.out.println(cm);
	return cm;
}
@GetMapping("/GetById/{customerID}")
public Optional<Customer> GetByIdDetails(@RequestBody Customer customer,@PathVariable int customerID) {
	Optional<Customer> cm=customerRepository.findById(customerID);
	return cm;
}
@PutMapping("/put/{customerID}")
public String UpadateDetails(@RequestBody Customer customer,@PathVariable int customerID) {
	customerRepository.save(customer);
	return "Customer Details updated Succefully";
}
@GetMapping("/Greet")
public String Greeting() {
	return "Prashanth Patel";
}
}
