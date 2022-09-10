package com.airobosoft.model;

public class Address 
{
	private String streetName;
	private int pincode;
	public Address(String streetName, int pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
