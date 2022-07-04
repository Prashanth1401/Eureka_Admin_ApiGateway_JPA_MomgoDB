package com.prashanth.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prashanth.model.Customer;

//@FeignClient(name = "MS-Customer-API",url = "localhost:9001")
public interface Proxy {
	// @PostMapping("/JPA/post")
	 //   public List<Customer> saveUser(@RequestBody Customer customer);
}
