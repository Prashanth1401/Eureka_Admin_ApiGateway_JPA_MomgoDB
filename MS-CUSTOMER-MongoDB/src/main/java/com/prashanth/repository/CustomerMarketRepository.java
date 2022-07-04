package com.prashanth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prashanth.model.Customer;

public interface CustomerMarketRepository extends MongoRepository<Customer,Integer> {

}
