package com.example.awsdemographic.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name = "demodhs")
public class DemoDhs {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

	private String type_referal;

	private Date dates;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentapplication_id", referencedColumnName = "id")
	ParentApplication parentapplication;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "co_applicant_id", referencedColumnName = "id")
	Co_Applicant co_applicant;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	List<Address> address;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "other_info_id", referencedColumnName = "id")
	Other_Info other_info;

	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getType_referal() {
		return type_referal;
	}




	public void setType_referal(String type_referal) {
		this.type_referal = type_referal;
	}




	public Date getDates() {
		return dates;
	}




	public void setDates(Date dates) {
		this.dates = dates;
	}




	public ParentApplication getParentapplication() {
		return parentapplication;
	}




	public void setParentapplication(ParentApplication parentapplication) {
		this.parentapplication = parentapplication;
	}




	public Co_Applicant getCo_applicant() {
		return co_applicant;
	}




	public void setCo_applicant(Co_Applicant co_applicant) {
		this.co_applicant = co_applicant;
	}




	public List<Address> getAddress() {
		return address;
	}




	public void setAddress(List<Address> address) {
		this.address = address;
	}




	public Other_Info getOther_info() {
		return other_info;
	}




	public void setOther_info(Other_Info other_info) {
		this.other_info = other_info;
	}




	public DemoDhs() {
	}

}
