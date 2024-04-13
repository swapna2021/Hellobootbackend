package com.spec.services;

import java.util.List;

import com.spec.entities.BankAccount;

public interface BankAccountServiceInterface {
	public List<BankAccount> getAllBankAccountsInfo();
	public BankAccount getBankAccountOfAccountNum(int accountNum);
	public BankAccount insertBankAccount(BankAccount bankAccount);
	public BankAccount updateBankAccount(int accountNum,BankAccount bankAccount);
	public void deleteBankAccount(int accountNum);

}
