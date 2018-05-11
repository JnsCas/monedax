package com.rcn.test.monedax.model;

import java.math.BigDecimal;
import java.util.Date;

public class Block {
	
	private BigDecimal quantity;
	private Date date;
	
	public Block(BigDecimal quantity, Date date) {
		this.quantity =	quantity;
		this.date =	date;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
