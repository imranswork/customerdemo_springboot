package com.ericsson.customerserviceapp.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ES_Customer")
@Getter
@Setter
public class Customer {
	@Id
	@Column(name="AdharCard_No")
	private long adharCardNo;
	@Column(name="First_Name",nullable = false,length = 50)
	private String firstName;
	@Column(name="Last_Name",nullable = false,length = 50)
	private String lastName;
	@Column(name="Email",nullable = false,length = 150)
	private String email;
	@Column(name="MobileNo",unique = true)
	private long mobileNo;
	@DateTimeFormat(iso=ISO.DATE)
	@Column(name="DOB")
	private LocalDate dob;
	
	

}
