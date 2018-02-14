package basics;

public class Weather {
	public static void main(String[] args){
		// this program will suggest what to wear depending on the weather ( temperature)
		
		int temperature = 65;
		String sunCondition = "Sunny";
		
		if (temperature > 80){
			System.out.println("Wheather pleasent. Wear shorts and t-shirts");
		}
		else if ((temperature>60) && (sunCondition == "Sunny")){
			System.out.println("It's a little cooler. Perhaps wear long-shelve shirts and jeans");
		}
		else if ((temperature > 50) || (sunCondition != "Sunny")){
			System.out.println("This is a cool day, make sure to weare wramth clothes");
		}
		else {
			System.out.println("It's cold. Wear a sweater");
		}
		System.out.println("This programm is ending !");
	}

}
