package com.prashanth.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
	@Id
private Integer customerID;
private String customerName;
private List<SuperMarket> groceryList;
public Customer(Integer customerID, String customerName, List<SuperMarket> groceryList) {
	super();
	this.customerID = customerID;
	this.customerName = customerName;
	this.groceryList = groceryList;
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
public List<SuperMarket> getGroceryList() {
	return groceryList;
}
public void setGroceryList(List<SuperMarket> groceryList) {
	this.groceryList = groceryList;
}
@Override
public String toString() {
	return "customer [customerID=" + customerID + ", customerName=" + customerName + ", groceryList=" + groceryList
			+ "]";
}


}
