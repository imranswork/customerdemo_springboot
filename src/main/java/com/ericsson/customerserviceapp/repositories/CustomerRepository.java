package com.ericsson.customerserviceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ericsson.customerserviceapp.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	//JPA refers class and fields not table
	@Query("delete from Customer customer where customer.mobileNo=:mobileNo")
	public void deleteCustomerByMobileNo(@Param("mobileNo") long mobileNo );
	
	//JPA refers class and fields not table
	@Query("select customer from Customer customer where customer.mobileNo=:mobileNo")
	public Customer findCustomerByMobileNo(@Param("mobileNo") long mobileNo );
	
}
