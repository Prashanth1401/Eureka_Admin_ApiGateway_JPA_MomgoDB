package com.prashanth;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prashanth.model.Customer;

@FeignClient(name="MS-Customer-API")
public interface CustomerGreet {
@GetMapping("/JPA/Greet")
public String invokeCustomerGreetAPI();
@PostMapping("/JPA/post")
public Customer saveUser(@RequestBody Customer customer);
}
