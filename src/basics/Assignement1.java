package basics;

public class Assignement1 {

	public static void main(String[] args) {
		
	    //array declaration
		int array[] = new int[] {45,-66,78,23,78,- 123,500};
			
		// function that takes a value n returns the sum of numbers 1 to n
		sum(5);
		
		//factorial value
		factorial(5);
		
		// call function max
		
		int max = maxArr(array);
		System.out.println("Max value is: "+ max);
		
		//call function min
		
		int min = minArr(array);
		System.out.println("min value is: "+ min);
		
		//call function Average of array values
		
		double average = Average(array);
		System.out.println("Average value is: "+ average);
	
	}
	
	// function that calculates the sum of first n numbers
	public static int sum (int number){
		int x = 0;
		for (int i=1;i<=number;i++){
			x = x + i;
		}
		System.out.println("Sum of first " + number + " numbers is: " + x);
		return x;
	}
	
	//function to compute factorial value
	
		  
	/* public static int factorial( int n){
	 if ( n == 0){
	 	return 1;
	   }
	   else if ( n==1) {
	     return 1;
	   }
	  return factorial(n-1)*n;
	   }
	   */
	 
	
	public static int factorial(int nb){
		int f = 1;
		if (nb==1){
			System.out.println("Factorial value for " + nb + " nnumbers is 1");
			return 1;
		}
		else if (nb ==2){
			System.out.println("Factorial value for " + nb + " numbers is 2");
			return 2;
		}
 		else if (nb > 2){
		for (int i=2; i<=nb; i++){
			f = f*i;
		}
		}
		System.out.println("Factorial value for " + nb + " numbers is: " +f);
		return f;
	}
	
	
	//function returns max of an array
	
	public static int maxArr(int[] InputArray){
		int maxValue = InputArray[0];
		for (int i=1;i<InputArray.length;i++){
			if (InputArray[i] > maxValue) {
				maxValue = InputArray[i];
			}
		}
		return maxValue;
	}
	
	//function that returns min of an array
	
	public static int minArr(int[] InputArray){
		int minValue = InputArray[0];
		for (int i=1;i<InputArray.length;i++){
			if (InputArray[i] < minValue) {
				minValue = InputArray[i];
			}
		}
		return minValue;
	}
	
	//function calculates average of an integer array
	
	public static double Average ( int [] InputArray){
		int sum = 0;
		for (int i=0;i<InputArray.length;i++){
			sum = sum + InputArray[i];
		}
		return sum / InputArray.length;
		}
}
