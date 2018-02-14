package OOP;

public class BankAccount implements IRate{
	
	//Define variables

	String accountNumber;
	
	//static belongs to the class, not the object instance
	//final >> it will be a constant value ( with no possibility of change in main)
	//often used static final
	private static final String routingNumber = "06444"; 
	
	
	// Instance Variables
	
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions : unique methods
		// 1 .They are used to define/setup/initialize properties of an object
		// 2. Constructor are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructos have NO return type
	
	BankAccount(){
		System.out.println("new accout created");
	}
	
	
	// Overloading : call same method name with different arguments
	// Polymorphism ; basic : call the same name with different parameters
	
	BankAccount(String accountType){
		System.out.println("New accout : " +accountType + " with no deposit");
	}
	
	//Another constructor with different arguments 
	
	BankAccount(String accountType, double initDeposit){
	//initDeposit, accoutType, Msg are local variables
		System.out.print("New account created : " + accountType);
		System.out.println("Initial deposit: " + initDeposit);
		String Msg = null;
		if(initDeposit <1000){
			// if I let Script Msg I will have an error of double variable name
			 Msg = "ERROR : Minimum deposit should be at least $ 1,000";
		} else {
			 Msg = " Thanks for the initial deposit of: $" + initDeposit;
			 balance = initDeposit;
		}
		
		// If I try to print Msg widouth initial declaration in the block, the variable
		//will not be visible outside the if block
		
		System.out.println(Msg);
		
	}
	
	// variables are available only in the blocks where they were defined
	
	// Getters/Setters
	
	//Allow the user to define the name
	
	public void setName(String name){
		// public method where I call with this.name the variable specific to the class
		// and name is a local variable, available only in the class
		this.name = "Mr."+ name;
	}
	public String getName(){
		return name;
	}
	
	//generatet from Source : getter and setters
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	//Define methods

	//public - available anywhere in the project ( in src)
	public void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	//default  - available anywhere in the package ( in OOP)
	void withdrawn(double withdrawn){
		balance = balance - withdrawn;
		showActivity("WITHDRAWN");
	}
	
	//private - available in the class, can be called only from the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION:" + activity);
		System.out.println("YOUR NEW BALANCE IS: " + balance);
	}
	
	void checkBalance(){
	// balance variable can be calculated in one constructor and called in anther method as 
	// it was declared in the class
		
		System.out.println("Balance :" + balance);
	}
	
	void getStatus(){
		
	}
	
	//overriding the toString method available in the inherited methods
	public String toString(){
		return "[" + name +". Account number : " + accountNumber + ". ROUTING NUMBER " + routingNumber+ ". BALANCE: $" + balance + "]";
	}
	
	//methods from our Interface methods
	
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	}


