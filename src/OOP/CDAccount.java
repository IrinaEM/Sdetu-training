package OOP;

public class CDAccount extends BankAccount implements IRate{
	
// inherits all methods from BankAccount
	
	String interestRate;
	
	void compound(){
		System.out.println("Compounding interest");
	}

}
