package com.prashanth.model;



public class SuperMarket {
private Integer itemNumber;
private String itemName;
private String itemPrice;
public SuperMarket(Integer itemNumber, String itemName, String itemPrice) {
	super();
	this.itemNumber = itemNumber;
	this.itemName = itemName;
	this.itemPrice = itemPrice;
}
public Integer getItemNumber() {
	return itemNumber;
}
public void setItemNumber(Integer itemNumber) {
	this.itemNumber = itemNumber;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getItemPrice() {
	return itemPrice;
}
public void setItemPrice(String itemPrice) {
	this.itemPrice = itemPrice;
}
@Override
public String toString() {
	return "SuperMarket [itemNumber=" + itemNumber + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
}

}
