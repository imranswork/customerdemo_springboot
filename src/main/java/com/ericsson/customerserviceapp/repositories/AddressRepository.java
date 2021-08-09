package com.ericsson.customerserviceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ericsson.customerserviceapp.models.Address;

public interface AddressRepository extends JpaRepository<Address,Integer>{

}
