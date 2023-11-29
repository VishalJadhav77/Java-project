package com.Bank;


	import java.util.HashMap;
	import java.util.Map;

	public class Bank {

		public static final String bankName = "OM SAI RAM BANK";

		private static Map<String, Account> bankDB;

		// creating HashMap object and initialization of bankDB variable using static
		// initializer block.
		static {
			bankDB = new HashMap<>();
		}

		// create new bank account and store it into bankDb.
		public static void createNewAccount(String accountHolderName, String accountNumber, double balance,
				String phoneNumber, AdharCard adharCard, Pancard panCard) {
			Account account = new Account(accountHolderName, accountNumber, balance, phoneNumber, adharCard, panCard);

			// adding account object to bankDB Map
			bankDB.put(accountNumber, account);

			System.out.println("Welcome To " + bankName + " Bank");
			System.out.println("Your Account is created successfully with A/c No " + accountNumber);
		}

		// remove existing account from bankDB.
		public static void removeAccount(String accountNumber) {

			if (bankDB.containsKey(accountNumber)) {
				bankDB.remove(accountNumber);
				System.out.println("Thank you for using our bank " + bankName);
				System.out.println("Your Account is deleted successfully with A/c No " + accountNumber);
			} else {
				System.out.println("Account with A/c No: " + accountNumber + " is not found in database");
			}

		}

		// getting single account from bank database.
		public static Account getAccount(String accountNumber) {
			Account account = null;
			if (bankDB.containsKey(accountNumber)) {
				account = bankDB.get(accountNumber);
			}
			return account;
		}

		// getting all account and printing details of all accounts present in bankDB.
		public static void getAllAccountsInformation() {
			// printing all database of bank.
			System.out.println("Bank database: " + bankDB);

			try {
				for (String key : bankDB.keySet()) {
					bankDB.get(key).getAccountHolderInformation();
				}
			} catch (Exception e) {
				System.out.println("No record/account found in bank db");
			}

		}

	}

