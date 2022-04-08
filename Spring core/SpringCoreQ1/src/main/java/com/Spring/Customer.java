package com.Spring;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerContact;
	private Address customerAddress;
	
	public Customer() {}
	
	public Customer(String customerName, int customerId, String customerContact, Address customerAddress) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void customerDetail() {
		System.out.println("Customer Id: "+customerId+" ,Customer Name: "+customerName+" ,Customer Contact: "+customerContact+" ,Customer Address: Street: "+customerAddress.getStreet()+" ,City: "+customerAddress.getCity()+" ,State: "+customerAddress.getState()+" ,Zip: "+customerAddress.getZip()+" ,Country"+customerAddress.getCountry()+".");
	}
	
}
