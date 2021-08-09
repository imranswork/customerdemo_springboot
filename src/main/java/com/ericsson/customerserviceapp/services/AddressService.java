package com.ericsson.customerserviceapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ericsson.customerserviceapp.models.Address;
import com.ericsson.customerserviceapp.models.Customer;
import com.ericsson.customerserviceapp.repositories.AddressRepository;
import com.ericsson.customerserviceapp.repositories.CustomerRepository;

@Service
public class AddressService {
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
    private AddressRepository addressRepo;
    
	//insert operation
		public Address saveAddress(Address address, long adharCardNo)
		{
			Customer customer=customerRepo.findById(adharCardNo).orElse(null);
			address.setCustomer(customer);
			return addressRepo.save(address);
		}
		
		//select * operation
		
		public List<Address> findAllAddresses()
		{
			return addressRepo.findAll();
		}
		
	
 
}
