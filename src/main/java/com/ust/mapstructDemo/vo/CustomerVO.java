package com.ust.mapstructDemo.vo;

public class CustomerVO {

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
	private String state22;
	private AddressVO address;

	/*
	 * public CustomerVO(long customerId, String firstName, String lastName, int
	 * age, String gender, String mobile, String email, String landline, String
	 * alternateMobile, String city, String state,AddressVO address) { super();
	 * this.customerId = customerId; this.firstName = firstName; this.lastName =
	 * lastName; this.age = age; this.gender = gender; this.mobile = mobile;
	 * this.email = email; this.landline = landline; this.alternateMobile =
	 * alternateMobile; this.city = city; this.state = state;
	 * //this.address(address); }
	 */

	public CustomerVO() {

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

	@Override
	public String toString() {
		return "CustomerVO [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", mobile=" + mobile + ", email=" + email + ", landline=" + landline
				+ ", alternateMobile=" + alternateMobile + ", city=" + city + ", state=" + state + "]";
	}

	public AddressVO getAddress() {
		return address;
	}

	public void setAddress(AddressVO address) {
		this.address = address;
	}

	public String getState22() {
		return state22;
	}

	public void setState22(String state22) {
		this.state22 = state22;
	}

	

	/*public String getState22() {
		return state22;
	}

	public void setState22(String state22) {
		this.state22 = state22;
	}*/
	

}
