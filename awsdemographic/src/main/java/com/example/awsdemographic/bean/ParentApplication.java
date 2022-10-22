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

import com.example.awsdemographic.ssnhashing.SocialSecurityNumber;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name="parentapplication")
public class ParentApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "parentproofofidentity_id", referencedColumnName = "id")
	List<ParentProofOfIdentity> parentproofofidentity;
	
	@JsonBackReference
	@OneToOne(mappedBy = "parentapplication")
	private DemoDhs demodhs;

	String lastname;
	String firstname;
	String mi;
	String ssn;
	Date dob;
	String race;
	String ethnicity;
	String gender;
	String relationship_to_the_child;
//	String userkey;

	public DemoDhs getDemodhs() {
		return demodhs;
	}

	public void setDemodhs(DemoDhs demodhs) {
		this.demodhs = demodhs;
	}

//	public String getUserkey() {
//		return userkey;
//	}
//
//	public void setUserkey(String userkey) {
//		this.userkey = userkey;
//	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMi() {
		return mi;
	}

	public void setMi(String mi) {
		this.mi = mi;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		SocialSecurityNumber socialSecurityNumber = new SocialSecurityNumber();
		this.ssn = socialSecurityNumber.getSsnEncryption(ssn);
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRelationship_to_the_child() {
		return relationship_to_the_child;
	}

	public void setRelationship_to_the_child(String relationship_to_the_child) {
		this.relationship_to_the_child = relationship_to_the_child;
	}

	public List<ParentProofOfIdentity> getParentproofofidentity() {
		return parentproofofidentity;
	}

	public void setParentproofofidentity(List<ParentProofOfIdentity> parentproofofidentity) {
		this.parentproofofidentity = parentproofofidentity;
	}

}
