package OOP;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortShedule();
		la.setTerm(20);
		
		//Polymorphism changes where we are pointing
		// because IRate is an interface referred by LoanAccout
		//we can declare a variable of type Interface by pointing on the new class LoanAccount
		
		IRate account1 =  new LoanAccount();
		
		//account1 is based on IRate properties
		//will be limited only to the methods available in IRate
		//when we call the methods will call the methods described in LoanAccount
		
		
		account1.setRate();
		account1.increaseRate();
		
		//generic function toString, not the one overritted, as LoanAccount has IRate interface
		// only, is not inherist the BanckAccount class
		

		System.out.println(account1.toString());
		

	}

}
