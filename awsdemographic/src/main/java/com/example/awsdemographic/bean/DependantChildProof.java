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
public class DependantChildProof {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

//	@OneToOne(mappedBy = "address")
//	private DemoDhs demodhs;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dependantchildproof")
	private Other_Info otherinfo;
	
	
	private String userkey;
	

	public String getUserkey() {
		return userkey;
	}
	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}
	public Other_Info getOtherinfo() {
		return otherinfo;
	}
	public void setOtherinfo(Other_Info otherinfo) {
		this.otherinfo = otherinfo;
	}
	
}
