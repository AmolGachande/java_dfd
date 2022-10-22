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
public class ParentProofOfIdentity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

//	@OneToOne(mappedBy = "address")
//	private DemoDhs demodhs;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentproofofidentity")
	private ParentApplication parentapplication;
	
	private String document_type;
	private String userkey;
	
	
	public ParentApplication getParentapplication() {
		return parentapplication;
	}
	public void setParentapplication(ParentApplication parentapplication) {
		this.parentapplication = parentapplication;
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
