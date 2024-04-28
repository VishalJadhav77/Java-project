package banking.com;
import java.util.Random;
import java.util.Scanner;

public class Account {
	
	public static String bankName="HomeTown Bank";
	public static String ifscCode="PC12345";
	public static String bankAddress="Shelgaon";
	public static String bankContactNumber="9172033400";
	
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	private String contactNumber;
	private String adharNumber;
	private String panNumber;
	private double password;
	Scanner sc = new Scanner(System.in);
	public void CreateAccount() {
		System.out.println("Enter account holder name");
		accountHolderName = sc.nextLine();
		System.out.println("Enter account number");
		accountNumber = sc.nextLine();
		System.out.println("Enter Initial balance");
		balance = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter contact Number");
		contactNumber = sc.nextLine();
		System.out.println("Enter adhar number");
		adharNumber = sc.nextLine();
		System.out.println("enter pan card number");
		panNumber = sc.nextLine();
		System.out.println("Your account has been created");
		password = Math.random();
		System.out.println("Your one time password="+password);
		menu1();
		}
	public  void Login() {
		System.out.println("enter your mobile number");
		String userName = sc.nextLine();
		System.out.println("enter Password");
		double pass = sc.nextDouble();
		if(contactNumber.equals(userName) && password == pass)
		{
			System.out.println("Log in successfully");
			menu();
		}
		else
		{
			System.out.println("Please enter valid details");
			menu1();
		}
	}
		void DisplayAccountInformation() {
			System.out.println("************************************************************");
			System.out.println("accountHolderName="+accountHolderName);
			System.out.println("accountNumber="+accountNumber);
			System.out.println("balance="+balance);
			System.out.println("contactNumber="+contactNumber);
			System.out.println("adharNumber="+adharNumber);
			System.out.println("panNumber="+panNumber);
			System.out.println("Bank Name="+bankName);
			System.out.println("IFSC code="+ifscCode);
			System.out.println(" Address="+bankAddress);
			System.out.println("Bank Contact Number="+bankContactNumber);
			System.out.println("************************************************************");
			menu();
			
		}
	

	public  void CashDeposit() {
		System.out.println("Enter the Amount");
		double amount = sc.nextDouble();
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Amount has been creadited");
		}
		else
		{
			System.out.println("please enter valid amount");
		}
		
		menu();
	}
	public void CashWithdrawal() {
		System.out.println("Enter the Amount");
		double amount = sc.nextDouble();
		if(amount>0)
		{
			if(amount<balance)
			{
				balance = balance - amount;
				System.out.println("Amount has been debited");
			}
			else
			{
				System.out.println("insufficient funds");
			}
		}
		else
		{
			System.out.println("please enter valid amount");
		}
		menu();


	}
	public void checkBalance() {
		System.out.println("************************************************************");
	    System.out.println("Your Current Balance="+balance);	
	    System.out.println("************************************************************");
	    menu();
	}

	public void LogOut() {
		
		System.out.println("Log out successfully");
		menu1();
		System.exit(0);
		
	}

	void menu1()
	{
		int ch1;
		System.out.println("************************************************************");
		System.out.println("1. Create your Account");
		System.out.println("2. Login");
		System.out.println("************************************************************");
		Scanner sc = new Scanner(System.in);
        System.out.println("please select option");
        ch1 = sc.nextInt();
		switch(ch1)
		{
			case 1:
				CreateAccount();
				break;
			case 2:
				Login();
				break;
			default:
				System.out.println("wrong choice");
				break;
		}		
		}
		
	
	void menu() {
	int ch;
	System.out.println("************************************************************");
	System.out.println("1. Deposite your cash");
	System.out.println("2. Withdrawal your cash");
	System.out.println("3. Dispaly Account Information");
	System.out.println("4. Check Balance");
	System.out.println("5. Log Out");
	System.out.println("************************************************************");
	Scanner sc = new Scanner(System.in);
    System.out.println("please select option");
    ch = sc.nextInt();
	switch(ch) {
	case 1:
		CashDeposit();
		break;
	case 2:
		CashWithdrawal();
		break;
	case 3:
		DisplayAccountInformation();
		break;
	case 4:
		checkBalance();
		break;
	case 5:
		LogOut();
		break;
	default:
		System.out.println("please select valid option");
		break;
		
}
}
public static void main(String[] args) {

Account p = new Account();
p.menu1();
System.out.println("******************************************************************************");

	{
		

	}
}	
	}




