package Lab2;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1= new BankAccount ("343656345345",1000);
		BankAccount acc2= new BankAccount ("123475948685",2000);
		BankAccount acc3= new BankAccount ("234354364565",2500);
		BankAccount acc4= new BankAccount ("6567868787875",3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(200);
		acc1.payBill(450);
		
		acc1.accrue();
		
		System.out.println(acc1.toString());
		
	}	

}

	
class BankAccount implements IInterest{
	// Properties of a bank account
	private static int ID = 1000; 	// Internal ID
									// for using encapsulation, the variables are private
									//client will not have acces to these variables except through the methods we will provide
	private String accountNumber;   // ID + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "0006524362";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructors
	
	public BankAccount(String SSN, double initDeposit){
		//we use SSN to generate an account number
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber(){
		// obtain a random value multiply by 10 to be 2 digits and we want it to 
		// be stored as an integer
		int random = (int) (Math.random()*100); 
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your account number is: " + accountNumber);
	}
	
	// set and get the name
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void payBill ( double amount){
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit ( double amount){
		balance = balance + amount;
		System.out.println("Making deposit of: " + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}
	
	// Override
	public void accrue(){
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	//Override 
	public String toString(){
		return "[Name: " +  name + "] \n[Account Number : " + accountNumber + "]\n" + "[Routing number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
}

