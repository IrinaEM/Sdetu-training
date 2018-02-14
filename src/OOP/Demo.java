package OOP;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+ "is walking");
	}
	
	void eat(){
		System.out.println(name+ "is eating");
	}
	
	void sleep(){
		System.out.println(name+ "is sleeping");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// instatiating an object
		
		Person person1 =  new Person();
		
		// define some properties
		
		person1.name = "joe";
		person1.email = "cskjdhks";
		person1.phone = "24632643";
		
		//abstraction - get information from that object, only the part that we want
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 =  new Person();
		person2.name = "Sarah";
		
		person2.sleep();
		
/*		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name="Joe";
		String email ="irina_mihnea@yahoo.com";
		String phone="0758047692";

		// Action, activity, behaviour
		
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we want to do for another person - we need to copy all above again
		String name2="Sarah";
		String email2 ="irina_mihnea@yahoo.com";
		String phone2="0758047692";

		walking(name2);
		
		//what about binding attributes and properties together
		
		
		
		
		}
	// enhance by adding functions to minimize code
	static void walking(String name){
		System.out.println(name + " is walking");*/
		}
		
}