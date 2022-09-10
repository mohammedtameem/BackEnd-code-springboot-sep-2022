package com.airobosoft.model;

public class Customer {

	private int id;
	private String firstName;
	private int age;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(int id, String firstName, int age, Address address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}
	
	
	
	
	

}
