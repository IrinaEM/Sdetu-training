package OOP;

public class LoanAccount implements IRate{

	@Override
	public void setRate() {
		System.out.println("Rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increate Rate");
		
	}
	
	public void setTerm (int terms){
		System.out.println("Setting the term to : " + terms + " years");
	}
	
	public void setAmmortShedule (){
		System.out.println("Amortization shedule");
	}

	

}
