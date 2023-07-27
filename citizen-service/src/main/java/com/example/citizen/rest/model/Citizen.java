package com.example.citizen.rest.model;

import java.time.Instant;

public class Citizen {

	private String name;
	private String surname;
	private Instant birthDate;
	private String mothername;
	private String fathername;
	private String NINumber;
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", mothername="
				+ mothername + ", fathername=" + fathername + ", NINumber=" + NINumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Instant getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getNINumber() {
		return NINumber;
	}
	public void setNINumber(String nINumber) {
		NINumber = nINumber;
	}
	
	
	
	
}
