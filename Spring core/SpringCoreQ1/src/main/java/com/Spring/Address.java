package com.Spring;

public class Address {
	private String street;
	private String city;
	private String state;
	private String country;
	private String zip;
	
	public Address() {}
	
	public Address(String street, String city, String country, String state, String zip) {
		this.street = street;
		this.city = city;
		this.country = country;
		this.state = state;
		this.zip = zip;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
