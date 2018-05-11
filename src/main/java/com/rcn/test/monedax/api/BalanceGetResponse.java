package com.rcn.test.monedax.api;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.rcn.test.monedax.model.Block;

public class BalanceGetResponse {
	
	/**
	 * Balance actual, calculado como totalQuantity * priceCoin
	 */
	private BigDecimal balance;
	
	/**
	 * Cantitad total de moneda.
	 */
	private BigDecimal totalQuantity;
	
	/**
	 * Detalle del balance. Incluye cantidad depositada por fecha.
	 */
	private ArrayList<Block> balanceDetail;
	
	
	public BalanceGetResponse(BigDecimal balance, BigDecimal totalQuantity, ArrayList<Block> blocksForAddress) {
		this.balance = balance;
		this.totalQuantity = totalQuantity;
		this.balanceDetail = blocksForAddress;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(BigDecimal totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public ArrayList<Block> getBalanceDetail() {
		return balanceDetail;
	}
	public void setBalanceDetail(ArrayList<Block> balanceDetail) {
		this.balanceDetail = balanceDetail;
	}
	
	

}
