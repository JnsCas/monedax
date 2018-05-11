package com.rcn.test.monedax.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rcn.test.monedax.api.CreateAccountRequest;
import com.rcn.test.monedax.model.Account;
import com.rcn.test.monedax.services.AccountService;

@RestController
@RequestMapping("/monedax")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value= "/crearcuenta", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Account createAccount(@RequestBody CreateAccountRequest request) {
		return accountService.create(request.getEmail());
	}
}
