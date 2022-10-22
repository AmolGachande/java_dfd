package com.example.awsdemographic.bean;

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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@Table(name="otherinfo")
public class Other_Info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NonNull
	@Column(name = "id")
	private Long id;
	@JsonBackReference

	@OneToOne(mappedBy = "other_info")
	private DemoDhs demodhs;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dependantadultproof_id", referencedColumnName = "id")
	List<DependantAdultProof> dependantadultproof;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "dependantchildproof_id", referencedColumnName = "id")
	List<DependantChildProof> dependantchildproof;
	
	String dependant_children;
	String dependant_adults;
	String number_of_applicantandcoapplicant;
	String military_status;
	String primary_language;
	String total_family_size;

//	String userkey;
//
//	public String getUserkey() {
//		return userkey;
//	}
//
//	public void setUserkey(String userkey) {
//		this.userkey = userkey;
//	}

	
	public Other_Info() {
	}

	public DemoDhs getDemodhs() {
		return demodhs;
	}

	public void setDemodhs(DemoDhs demodhs) {
		this.demodhs = demodhs;
	}

	public List<DependantAdultProof> getDependantadultproof() {
		return dependantadultproof;
	}

	public void setDependantadultproof(List<DependantAdultProof> dependantadultproof) {
		this.dependantadultproof = dependantadultproof;
	}

	

	public List<DependantChildProof> getDependantchildproof() {
		return dependantchildproof;
	}

	public void setDependantchildproof(List<DependantChildProof> dependantchildproof) {
		this.dependantchildproof = dependantchildproof;
	}

	public String getDependant_children() {
		return dependant_children;
	}

	public void setDependant_children(String dependant_children) {
		this.dependant_children = dependant_children;
	}

	public String getDependant_adults() {
		return dependant_adults;
	}

	public void setDependant_adults(String dependant_adults) {
		this.dependant_adults = dependant_adults;
	}

	public String getNumber_of_applicantandcoapplicant() {
		return number_of_applicantandcoapplicant;
	}

	public void setNumber_of_applicantandcoapplicant(String number_of_applicantandcoapplicant) {
		this.number_of_applicantandcoapplicant = number_of_applicantandcoapplicant;
	}

	public String getMilitary_status() {
		return military_status;
	}

	public void setMilitary_status(String military_status) {
		this.military_status = military_status;
	}

	public String getPrimary_language() {
		return primary_language;
	}

	public void setPrimary_language(String primary_language) {
		this.primary_language = primary_language;
	}

	public String getTotal_family_size() {
		return total_family_size;
	}

	public void setTotal_family_size(String total_family_size) {
		this.total_family_size = total_family_size;
	}
}
