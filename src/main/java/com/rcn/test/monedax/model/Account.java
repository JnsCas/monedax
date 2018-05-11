package com.rcn.test.monedax.model;

import java.util.UUID;

public class Account {
	
	private String address;
	private String email;
	
	public Account(String email) {
		this.email = email;
		this.address = UUID.randomUUID().toString();
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
