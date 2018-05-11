package com.rcn.test.monedax.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rcn.test.monedax.api.BalanceGetResponse;
import com.rcn.test.monedax.api.SendBalanceRequest;
import com.rcn.test.monedax.services.BalanceService;

@RestController
@RequestMapping("/monedax/balance")
public class BalanceController {

	@Autowired
	private BalanceService balanceService;
	
	@RequestMapping(value="/enviar", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void sendBalance(@RequestBody SendBalanceRequest request) {
		balanceService.sendBalance(request);
	}
	
	@RequestMapping(value= "/obtener", method = RequestMethod.GET)
	public BalanceGetResponse getBalance(@RequestParam(value="address") String address) {
		return balanceService.getBalance(address);
	}
	
}
