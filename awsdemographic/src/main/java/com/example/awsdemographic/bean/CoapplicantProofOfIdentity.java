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
public class CoapplicantProofOfIdentity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

//	@OneToOne(mappedBy = "address")
//	private DemoDhs demodhs;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "coapplicantproofofidentity")
	private Co_Applicant co_applicant;
	
	private String document_type;
	private String userkey;
	
	public Co_Applicant getCo_applicant() {
		return co_applicant;
	}
	public void setCo_applicant(Co_Applicant co_applicant) {
		this.co_applicant = co_applicant;
	}
	
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	public String getUserkey() {
		return userkey;
	}
	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}
	
	
}
