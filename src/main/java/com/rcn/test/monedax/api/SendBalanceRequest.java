package com.rcn.test.monedax.api;

import java.math.BigDecimal;

public class SendBalanceRequest {
	
	private String address;
	private BigDecimal quantity;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	
	

}
