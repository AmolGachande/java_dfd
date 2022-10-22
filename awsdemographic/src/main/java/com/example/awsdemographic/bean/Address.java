package com.example.awsdemographic.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

//	@OneToOne(mappedBy = "address")
//	private DemoDhs demodhs;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
	private DemoDhs demodhs;
	String type;

	String line1;
	String line2;
	String city;
	String state;
	String zip;
	String school_district;
	String cell_phone;
	String home_phone;
	String email;
	String proof_of_address;
//	String userkey;
//
//
//	public String getUserkey() {
//		return userkey;
//	}
//
//	public void setUserkey(String userkey) {
//		this.userkey = userkey;
//	}

	public DemoDhs getDemodhs() {
		return demodhs;
	}

	public void setDemodhs(DemoDhs demodhs) {
		this.demodhs = demodhs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getSchool_district() {
		return school_district;
	}

	public void setSchool_district(String school_district) {
		this.school_district = school_district;
	}

	public String getCell_phone() {
		return cell_phone;
	}

	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}

	public String getHome_phone() {
		return home_phone;
	}

	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProof_of_address() {
		return proof_of_address;
	}

	public void setProof_of_address(String proof_of_address) {
		this.proof_of_address = proof_of_address;
	}

	public Address() {
	}
}
