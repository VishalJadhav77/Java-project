package com.Bank;
	import java.util.Scanner;

	public class Client {
		
		public static void main(String[] args) {
			
			// providing console base GUI to client so that Client can use BANING APPLICATION
			Scanner sc = new Scanner(System.in);
			System.out.println("\t\t ***************** WELCOME TO " + Bank.bankName + " *****************");
			while(true) {
				
				System.out.println("--------------------------------------------------------------");
				
				System.out.println("\t\t 1: Create New Account");
				System.out.println("\t\t 2: Check Balance");
				System.out.println("\t\t 3: Deposit");
				System.out.println("\t\t 4: Withdraw");
				System.out.println("\t\t 5: Account Holder Information");
				System.out.println("\t\t 6: List Of All Accounts");
				System.out.println("\t\t 7: Delete Bank Account");
				System.out.println("\t\t 8: EXIT");
				
				System.out.println("--------------------------------------------------------------");
				
				System.out.print("Enter Your Choice: ");
				int choice = sc.nextInt();
				sc.nextLine();
				
				if(choice == 1) {
					System.out.print("Enter Account Holder Name: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					
					System.out.print("Enter Amount to deposit: ");
					double amount = sc.nextDouble();
					sc.nextLine();
					
					System.out.print("Enter Phone Number: ");
					String phoneNumber = sc.nextLine();
					
					System.out.print("Enter Address: ");
					String address = sc.nextLine();
					
					System.out.print("Enter DOB: ");
					String dob = sc.nextLine();
					
					System.out.print("Enter Adhar Number: ");
					String adharNumber = sc.nextLine();
					
					System.out.print("Enter PAN Number: ");
					String panNumber = sc.nextLine();
					
					AdharCard adharCard = new AdharCard(name, address, dob,adharNumber) ;
					Pancard panCard = new Pancard(name, dob, panNumber) ;
					
					Bank.createNewAccount(name,accountNumber,amount, phoneNumber,adharCard, panCard);
					
				} else if (choice == 2) {
					
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					
					try {
						Account account = Bank.getAccount(accountNumber);
						account.checkBalance();
					} catch (Exception e) {
						System.out.println("A/c not fount");
					}

				} else if (choice == 3) {
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					
					System.out.print("Enter Amount To deposit: ");
					double amount = sc.nextDouble();
					
					try {
						Account account = Bank.getAccount(accountNumber);
						account.deposit(amount);
					} catch (Exception e) {
						System.out.println("A/c not fount");
					}
					
				} else if (choice == 4) {
					
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					
					System.out.print("Enter Amount To Withdraw: ");
					double amount = sc.nextDouble();
					
					try {
						Account account = Bank.getAccount(accountNumber);
						account.withdraw(amount);
					} catch (Exception e) {
						System.out.println("A/c not fount");
					}
					
				} else if(choice == 5) {
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					try {
						Account account = Bank.getAccount(accountNumber);
						account.getAccountHolderInformation() ;
					} catch (Exception e) {
						System.out.println("A/c not fount");
					}
					
				}else if(choice ==6) {
					
					try {
						Bank.getAllAccountsInformation();
					} catch (Exception e) {
						System.out.println("No record/bank A/c found in bank db");
					}
					
				}else if (choice == 7) {
					
					System.out.print("Enter Account Number: ");
					String accountNumber = sc.nextLine();
					
					Bank.removeAccount(accountNumber);
					
				} else if (choice == 8) {
					break ;
				} else {
					
				}
				
			}
			
		}

	}


