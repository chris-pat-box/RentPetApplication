package com.rentpet.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * All the table related information is stored.
 * 
 * @author Pavan Singh
 *
 */

@Entity
@Table(name = "PetRent")
public class Pet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pet_rentId")
	private Integer petrentid;

	@Column(name = "renterName")
	private String renterName;

	@Column(name = "renterContact")
	private String renterContact;

	@Column(name = "renterEmail")
	private String renterEmail;

	public Integer getPetrentid() {
		return petrentid;
	}

	public void setPetrentid(Integer petrentid) {
		this.petrentid = petrentid;
	}

	public String getRenterName() {
		return renterName;
	}

	public void setRenterName(String renterName) {
		this.renterName = renterName;
	}

	public String getRenterContact() {
		return renterContact;
	}

	public void setRenterContact(String renterContact) {
		this.renterContact = renterContact;
	}

	public String getRenterEmail() {
		return renterEmail;
	}

	public void setRenterEmail(String renterEmail) {
		this.renterEmail = renterEmail;
	}
}
