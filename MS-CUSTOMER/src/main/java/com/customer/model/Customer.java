package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
private Integer customerID;
private String customerName;
public Customer() {
	
}
public Customer(Integer customerID, String customerName) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
}
public Integer getCustomerID() {
	return customerID;
}
public void setCustomerID(Integer customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
@Override
public String toString() {
	return "Customer [customerID=" + customerID + ", customerName=" + customerName + "]";
}

}
