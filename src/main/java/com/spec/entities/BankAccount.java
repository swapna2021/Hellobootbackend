package com.spec.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankAccount {
	
	String accountHolderName;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int accountNum;
	String bankName;
	String iFSCNum;
	String location;
	String accountHolderMobileNum;
	String accountHolderEmail;
	String pANNum;
	long aadharNum;
	public BankAccount() {
		super();
	}
	public BankAccount(String accountHolderName, int accountNum, String bankName, String iFSCNum, String location,
			String accountHolderMobileNum, String accountHolderEmail, String pANNum, long aadharNum) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNum = accountNum;
		this.bankName = bankName;
		this.iFSCNum = iFSCNum;
		this.location = location;
		this.accountHolderMobileNum = accountHolderMobileNum;
		this.accountHolderEmail = accountHolderEmail;
		this.pANNum = pANNum;
		this.aadharNum = aadharNum;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getiFSCNum() {
		return iFSCNum;
	}
	public void setiFSCNum(String iFSCNum) {
		this.iFSCNum = iFSCNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAccountHolderMobileNum() {
		return accountHolderMobileNum;
	}
	public void setAccountHolderMobileNum(String accountHolderMobileNum) {
		this.accountHolderMobileNum = accountHolderMobileNum;
	}
	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}
	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
	public String getpANNum() {
		return pANNum;
	}
	public void setpANNum(String pANNum) {
		this.pANNum = pANNum;
	}
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	@Override
	public String toString() {
		return "BankAccount [accountHolderName=" + accountHolderName + ", accountNum=" + accountNum + ", bankName="
				+ bankName + ", iFSCNum=" + iFSCNum + ", location=" + location + ", accountHolderMobileNum="
				+ accountHolderMobileNum + ", accountHolderEmail=" + accountHolderEmail + ", pANNum=" + pANNum
				+ ", aadharNum=" + aadharNum + "]";
	}

	

}
