package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank accout >> think instantianting an object
		
		BankAccount acc1 = new BankAccount();
		//acc1.name = " Roger";
		
		//with encapsulation : public API methods: needs getters and setters in 
		// client class
		
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		
		acc1.setSsn("23453749843");
		System.out.println("SSN : " +acc1.getSsn());
		
		acc1.accountNumber = "24932844923";
	
		acc1.balance = 2000;
		acc1.setRate();
		acc1.increaseRate();
		//showActivity will not be available if it is private
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdrawn(100);
		
		//Polymorphism through overriding
		
		System.out.println(acc1.toString());
		
		
// if I modify the routingNumber for one instace, the modification will be available 
  // for all instances is I'm not using final in the class
		
		//Polymorphism through overloading
		
		BankAccount acc2 = new BankAccount("merry");
		acc2.accountNumber = "24932844924";
		
		BankAccount acc3 = new BankAccount ( "juicy",1546.78);
		acc3.accountNumber = "24932844925";
		acc3.checkBalance();
/*		
		
	// Demo for inheritance : we will have acces to the methods from BankAccount and CDAccount
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 1000;
		cd1.interestRate = "4.5";
		cd1.setName(" Juan");
		cd1.accountType = "Cd Account";
		System.out.println(cd1.toString());
		cd1.compound();*/

	}

}
