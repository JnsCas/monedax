package com.rcn.test.monedax.services;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.rcn.test.monedax.api.BalanceGetResponse;
import com.rcn.test.monedax.api.SendBalanceRequest;
import com.rcn.test.monedax.model.Block;
import com.rcn.test.monedax.model.Blockchain;

@Service
public class BalanceService {

	private static Blockchain blockchain = Blockchain.getInstance();
	
	@Autowired
    private Environment environment;

	public void sendBalance(SendBalanceRequest request) {
		blockchain.addBalance(request.getAddress(), request.getQuantity());
	}

	public BalanceGetResponse getBalance(String address) {
		ArrayList<Block> blocksForAddress = blockchain.getBalanceByAddress(address);
		BigDecimal totalQuantity = BigDecimal.ZERO;
		for (Block block : blocksForAddress) {
			totalQuantity = totalQuantity.add(block.getQuantity());
		}
		BigDecimal priceCoin = new BigDecimal(environment.getProperty("priceCoin"));
		BigDecimal balance = totalQuantity.multiply(priceCoin);
		return new BalanceGetResponse(balance, totalQuantity, blocksForAddress);
	}


}
