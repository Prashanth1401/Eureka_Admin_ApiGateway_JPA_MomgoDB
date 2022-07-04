package com.prashanth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.CustomerGreet;
import com.prashanth.model.Customer;
import com.prashanth.repository.CustomerMarketRepository;

@RestController
@RequestMapping("/MongoDB")
public class CustomerMarketController {
	
@Autowired
private CustomerMarketRepository customerMarketRepository;
@Autowired
private CustomerGreet customerGreet;
@PostMapping("/save")
public String savingJPAANDMONGODB(@RequestBody Customer customer) {
	customerGreet.saveUser(customer);
	customerMarketRepository.save(customer);
	return " 💐 💐 Detailes saved in SQL And MongoDB successfully 💐 💐";
}
@PostMapping("/post")
public String saveCustomerMarketDetails(@RequestBody Customer customer) {
	customerMarketRepository.save(customer);
	return " saved customer marketList";
}

@GetMapping("/Get")
public List<Customer> GetAllList(@RequestBody Customer customer){
	List<Customer> ms=customerMarketRepository.findAll();
	System.out.println(ms);
	return ms;
	}
@GetMapping("/Greeting")
public String getmsg() {
	return "Hello welcome to solix";
}
@GetMapping("/welcome")
public String getMassage() {
	String ms=customerGreet.invokeCustomerGreetAPI();
	
	return "Hi "+ms+" welcome to solix";
}

}
