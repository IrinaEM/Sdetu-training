package basics;

public class SalaryCalculator {
	public static void main (String[] args){
		// Let's create a variable to define our career
		
		//declaring a variable
		
		String career;
		System.out.println("Program is starting: ");
		
		//Defining a variable
		
		career =  "Software Developper";
		System.out.println("My current role is:" + career);
		
		//Compute our annual salary
		//rate * hoursPerWeek* weeksperYear
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 40.50;
		career = "Manager";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as " + career + " at te rate $ " + rate + " per hour is $ "+ salary + " per year.");
		
		
		
		
		
	}

}
