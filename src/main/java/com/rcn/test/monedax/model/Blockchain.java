package com.rcn.test.monedax.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Blockchain {
	
	/**
	 * Posee como clave el address, y una lista de blockes asociados a este.
	 */
	private HashMap<String, ArrayList<Block>> blockchain;
	
	/**
	 * Singleton
	 */
	private static Blockchain instance;
	
	/**
	 * Lista de cuentas activas.
	 */
	private ArrayList<Account> accounts;
	
	private Blockchain() {
		this.blockchain 	= new HashMap<String, ArrayList<Block>>();
		this.accounts	= new ArrayList<Account>();
	}
	
	public static Blockchain getInstance() {
		if (instance == null) {
			instance = new Blockchain();
		}
		return instance;
	}

	public HashMap<String, ArrayList<Block>> getBlockchain() {
		return blockchain;
	}

	public void setBlockchain(HashMap<String, ArrayList<Block>> blockchain) {
		this.blockchain = blockchain;
	}

	public void addAccount(Account newAccount) {
		this.accounts.add(newAccount);
		this.blockchain.put(newAccount.getAddress(), new ArrayList<Block>());
	}

	public void addBalance(String address, BigDecimal quantity) {
		ArrayList<Block> blocksForAddress = this.blockchain.get(address);
		if (blocksForAddress != null) {
			blocksForAddress.add(new Block(quantity, new Date()));
		}
	}

	public ArrayList<Block> getBalanceByAddress(String address) {
		return this.blockchain.get(address);
		
	}
	
	

}
