package com.ust.mapstructDemo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
     
	@Id
	@GeneratedValue
	private long customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private String mobile;
	private String email;
	private String landline;
	private String alternateMobile;
	private String city;
	private String state;
	//private String state2;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	/*public Customer(long customerId, String firstName, String lastName, int age, String gender, String mobile,
			String email, String landline, String alternateMobile, String city, String state,Address address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.landline = landline;
		this.alternateMobile = alternateMobile;
		this.city = city;
		this.state = state;
		this.address=address;
	}*/

	public Customer() {

	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getAlternateMobile() {
		return alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		this.alternateMobile = alternateMobile;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}*/
	
	

}
