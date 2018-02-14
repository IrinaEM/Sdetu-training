package basics;

public class Cities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare and define an array
		String[] cities={"New York","San Francisco","Miami","Dallas"};
		System.out.println(cities[0]);
		
		//Declare the array
		String[] countries;
		
		//Define the array with he's size
		countries = new String[3]; // in an array index =size-1
		
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		
		//declare the array
		String[] states = new String[5]; //explicit defining size
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		// The do loops : entres the loop THEN tests conditions
				
		int i=0;
		do{
			System.out.println ( states[i]);
			i++;
		}while ( i<5);

		//while loops : tests conditions first then enter the loop
		
		int n= 0;
		boolean stateFound = false;
		while(!stateFound){
			String state = states[n];
			System.out.println(state);
			if (state == "Texas"){
				System.out.println("State found !!!");
				stateFound = true;
			}
			n++;
		}
		
		// printing with for loop
		System.out.println("\n printing with for loop");
		for (int x=0; x < 4 ;x++){
			System.out.println(states[x]);
		}
	}
}

