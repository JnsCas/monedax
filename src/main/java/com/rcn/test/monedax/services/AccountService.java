package com.rcn.test.monedax.services;

import org.springframework.stereotype.Service;

import com.rcn.test.monedax.model.Account;
import com.rcn.test.monedax.model.Blockchain;

@Service
public class AccountService {

	public Account create(String email) {
		Account newAccount = new Account(email);
		Blockchain.getInstance().addAccount(newAccount);
		return newAccount;
	}

}
