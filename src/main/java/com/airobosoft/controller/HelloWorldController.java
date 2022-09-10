package com.airobosoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airobosoft.model.Address;
import com.airobosoft.model.Customer;
import com.airobosoft.model.HelloWorld;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController
{
	@GetMapping("/hello")
	public List<Customer> helloagain()
	{
		Address a1 = new Address("MG Road",560001);
		Address a2 = new Address("Brigade Road",560003);
		
		// return new Customer(1,"Ramesh",23,"bangalore");
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1,"Ramesh",23,a1));
		list.add(new Customer(2,"Suresh",32,a2));
		list.add(new Customer(3,"John",45,a1));
		list.add(new Customer(4,"Mark",56,a1));
		list.add(new Customer(5,"Sara",27,a2));
		return list;
	}
	
	@GetMapping(path ="/hello-world")
	public HelloWorld getHelloAgain()
	{
	
		return new HelloWorld("welcome to spring boot application");
	}
	
	@GetMapping(path ="/hello-world/path-varable/{name}")
	public HelloWorld getHelloAgainWithParams(@PathVariable String name)
	{
		//throw new RuntimeException("Some Issue Occured! Please contact the Support at ***");
		return new HelloWorld(name);
	}
	
	
	
}
