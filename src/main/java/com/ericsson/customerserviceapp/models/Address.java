package com.ericsson.customerserviceapp.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ES_Address")
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Adderss_Id")	
	private int addressId;
	@Column(name="Door_No",nullable = false,length = 10)
	private String doorNo;
	@Column(name="Street_Name",nullable = false,length = 150)
	private String streetName;
	@Column(name="City",nullable = false,length = 150)
	private String city;
	@Column(name="State",nullable = false,length = 150)
	private String state;
	@Column(name="Pincode")
	private long pincode;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="AdharCardNo_FK")
	private Customer customer;
	

}
