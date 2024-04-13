package com.spec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entities.BankAccount;
import com.spec.repositories.BankAccountRepository;

@Service
public class BankAccountService implements BankAccountServiceInterface{

	@Autowired
	BankAccountRepository repository;
	
	
	@Override
	public List<BankAccount> getAllBankAccountsInfo() {	
		return repository.findAll();
	}
	@Override
	public BankAccount getBankAccountOfAccountNum(int accountNum) {
		//return value of findById is an optional object
		return repository.findById(accountNum).get();
	}
	@Override
	public BankAccount insertBankAccount(BankAccount bankAccount) {	
		return repository.save(bankAccount);
	}

	@Override
	public BankAccount updateBankAccount(int accountNum, BankAccount bankAccount) {
		
		
		BankAccount account=repository.findById(accountNum).get();
		System.out.println(account.getAccountNum());
		System.out.println(bankAccount.getAadharNum());
		account.setAccountHolderName(bankAccount.getAccountHolderName());
		account.setBankName(bankAccount.getBankName());
		account.setiFSCNum(bankAccount.getiFSCNum());
		account.setLocation(bankAccount.getLocation());
		account.setAccountHolderMobileNum(bankAccount.getAccountHolderMobileNum());
		account.setAccountHolderEmail(bankAccount.getAccountHolderEmail());
		account.setpANNum(bankAccount.getpANNum());
		account.setAadharNum(bankAccount.getAadharNum());
		return repository.save(account);
		
		
	}

	@Override
	public void deleteBankAccount(int accountNum) {
		BankAccount account=repository.findById(accountNum).get();
		System.out.println("account deleted");
		repository.delete(account);
		
	}

}
