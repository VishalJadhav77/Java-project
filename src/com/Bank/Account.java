package com.Bank;


public class Account {
	private String accountHolderName ;
	private String accountNumber ;
	private double balance ;
	private String phoneNumber ;
	private AdharCard adharCard ;
	private Pancard pancard ;
	
	public Account(String accountHolderName, String accountNumber, double balance, String phoneNumber,
			AdharCard adharCard, Pancard panCard) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.adharCard = adharCard;
		this.pancard = panCard;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public AdharCard getAdharCard() {
		return adharCard;
	}
	
	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}
	
	public Pancard getPanCard() {
		return pancard;
	}
	
	public void setPancard(Pancard panCard) {
		this.pancard = panCard;
	}
	
	public void deposit(double amount) {
		try {
			if(amount > 0) {
				this.balance = this.balance + amount ;
			}
			System.out.println("Your Account " + accountNumber + " is created with amount " + amount);
			System.out.println("Total Balance is: " + balance);
			
		} catch (Exception e) {
			System.out.println("Pelase enter valid amount");
		}

	}
	
	public void withdraw(double amount) {
		try {
			if(amount < this.balance) {
				this.balance = this.balance - amount ;
				System.out.println("Your Account " + accountNumber + " is debited with amount " + amount);
				System.out.println("AVL Bal is " + balance);
			}
			else {
				System.out.println("Sorry Can not process,insufficient balance !!!");
			}
			
		} catch (Exception e) {
			System.out.println("Pelase enter valid amount");
		}

	}
	
	public void checkBalance() {
		System.out.println("Your A/c No " + accountNumber);
		System.out.println("AVL Bal is " + balance);
	}
	
	
	public void getAccountHolderInformation() {
		System.out.println("Account Holder Name: " + this.accountHolderName);
		System.out.println("A/c Number: " + this.accountNumber);
		System.out.println("A/c AVL BAL: " + this.balance);
		System.out.println("Account Holder Contact Phone Number: " + phoneNumber);
		System.out.println("********* ADHAR CARD DETAILS *********");
		System.out.println("Name: " + adharCard.getMyName());
		System.out.println("DOB: " + adharCard.getDob());
		System.out.println("Address: " + adharCard.getAddress());
		System.out.println("Adhar Card Number: " + adharCard.getAdharNumber());
		System.out.println("********* PAN CARD DETAILS *********");
		System.out.println("Name: " + pancard.getName());
		System.out.println("DOB: " + pancard.getDob());
		System.out.println("Pan Card Number: " + pancard.getPanNumber());
		System.out.println("__________________________________________________________________");
	}
	
	
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", phoneNumber=" + phoneNumber + ", adharCard=" + adharCard + ", panCard=" + pancard + "]";
	}
	
}

