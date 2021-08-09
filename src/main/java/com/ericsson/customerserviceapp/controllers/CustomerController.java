package com.ericsson.customerserviceapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.customerserviceapp.models.Customer;
import com.ericsson.customerserviceapp.services.CustomerService;

@RestController
public class CustomerController {
    @Autowired
	private CustomerService customerService;
	@CrossOrigin("*")
	//@CrossOrigin(origins = {"http://localhost:7070", "http://localhost:8787"}, allowedHeaders = "*",methods = {RequestMethod.GET,RequestMethod.POST})
    @PostMapping("/addcustomer")
    public @ResponseBody Customer addCustomer(@RequestBody Customer customer)
    {
    	System.out.println("Got into controller");
		return customerService.saveCustomer(customer);
    }
	@CrossOrigin("*")
    @GetMapping("/getallcustomers")
    public List<Customer> getAllCustomers()
    {
    	return customerService.findAllCustomers();
    }
	
	@CrossOrigin("*")
    @GetMapping("/getcustomerbyid/{adharCardNo}")
    public Customer getCustomerById(@PathVariable("adharCardNo") long adharCardNo)
    {
    	return customerService.findByCustomerId(adharCardNo);
    }
    
	
}
