package com.ericsson.customerserviceapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericsson.customerserviceapp.models.Customer;
import com.ericsson.customerserviceapp.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;	

	//insert operation
	public Customer saveCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	//select * operation
	
	public List<Customer> findAllCustomers()
	{
		return customerRepo.findAll();
	}
	
	//find by id 
	
	public Customer findByCustomerId(long adharCardNo)
	{
		return customerRepo.findById(adharCardNo).orElse(null);
	}
	//update
	public Customer updateCustomer(Customer customer)
	{
		return customerRepo.save(customer);
	}
	
	//delete 
	public boolean deleteCustomerById(long mobileNo)
	{
		boolean status=false;
		customerRepo.deleteCustomerByMobileNo(mobileNo);
		if(customerRepo.findCustomerByMobileNo(mobileNo)!=null)
			status=true;
		return status;
	}
	
	
}
