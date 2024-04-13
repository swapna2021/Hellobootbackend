package com.spec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spec.entities.BankAccount;
import com.spec.services.BankAccountService;
@CrossOrigin("*")
@RestController
public class BankAccountController {
	
	@Autowired 
	BankAccountService service;
	
	@GetMapping("/account")
	public List<BankAccount> getAllBankAccountsInfo(){
		System.out.println("controller ");
		return service.getAllBankAccountsInfo();	
	}
	@GetMapping("/account/{accountNum}")
	public BankAccount getBankAccountByAccountNum(@PathVariable("accountNum") int accountNum) {
		return service.getBankAccountOfAccountNum(accountNum);
	}
	@PostMapping("/account")
	public BankAccount insertBankAccount(@RequestBody BankAccount bankAccount) {
		return service.insertBankAccount(bankAccount);
	}
	
	
	@PutMapping("/account/{accountNum}")
	public BankAccount updateBankAccount(@PathVariable("accountNum")int accountNum,@RequestBody BankAccount bankAccount) {
		return service.updateBankAccount(accountNum, bankAccount);
	}
	
	@DeleteMapping("/account/{accountNum}")
	public void deleteAccount(@PathVariable("accountNum")int accountNum) {
		service.deleteBankAccount(accountNum);
	}
	

}
