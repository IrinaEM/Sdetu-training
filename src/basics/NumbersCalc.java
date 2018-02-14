package basics;

public class NumbersCalc {
	
	public static void main(String[] args){
		
		System.out.println("Program is starting");
		
		printName();
		int numA = 10;
		int numB = 100;
		int summary = addNumbers (numA,numB);
		System.out.println("The sum of numbers " + numA + " and "+ numB + " is :"+ summary);
		int prod = multipleNumbers(numA,numB);
		
		System.out.println(" the product od numbers " + numA+" and "+numB+" is: "+ multipleNumbers(numA,numB));
		
		System.out.println("this time with prod:" + prod);
	}	
		
		static void printName(){
			System.out.println ("My name is Irina");
		}
		
		
		static int addNumbers (int numberA, int numberB){
			//This function will add two numbers
			int sum = numberA + numberB;
			
			return sum;
		
		}
		
		static int multipleNumbers(int valueA, int valueB){
			int product = valueA * valueB;
			System.out.println("in the multiple " + addNumbers(product + 100,product +10));
			
			
			return product;
		}

}
