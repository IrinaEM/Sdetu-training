package Lab2;

public class StudentDB {

	public static void main(String[] args) {
		StudentInfo student1 = new StudentInfo("Jim","457364536457");
		
		student1.setCity("Dallas");
		student1.setPhone("43574356984375435794388");
		student1.setState("Texas");
		
		
		System.out.println(" City: " + student1.getCity());
		System.out.println(" Phone: " + student1.getPhone());
		System.out.println(" State: " + student1.getState());
		
				
		student1.enroll();
		
		System.out.println("You're email adress is : " + student1.email());
		
		student1.pay(200);
			
				
		System.out.println(student1.toString());
		
		student1.showCourses();
	
	}

}

class StudentInfo implements ICourses{
	// Properties of a stundent
	
	private String name;
	private static int ID = 22;
	String email;    // created based on the name : name@gmail.com
	private String userID;   // static ID + random 4 digits + last 4 of SSN
	private String SSN;
	
	private String phone;
	private String city;
	private String state;
	
	private double balance = 1000; // initial balance supposed for a student
	
	String[] classes = new String[5];
	
	
	
	//Constructor
	public StudentInfo(String name, String SSN){
		this.name = name;
		this.SSN = SSN;
		email();
		getUserID();
		checkBalance();
					
	}
	
	
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String email (){
		String email = name + "@gmail.com";
		return email;
	}
	
	// each student should have min 5 courses
	
	// we will randomly generate the index in courses in order to complet the classes per student
	public void enroll(){
		System.out.println("You're enrolling !!!");
		for (int n=0 ;  n< 5 ; n++){
			int random = (int) (Math.random() * 6);
			classes[n] = courses[random];
		}
	}
	
	public void showCourses(){
		System.out.println("You're classes are : ");
		for (int n=0 ;  n< 5 ; n++){
			System.out.println("Class " + (n+1) + ": " + classes[n] ); 
		}
	}
	
	private void getUserID(){
		int random = (int)(Math.random()*10000);
		userID = ID +""+ random + SSN.substring(SSN.length()-4);
		System.out.println("You're user ID is: " + userID);
	}
	
	public void pay(double amount){
		balance = balance - amount;
		System.out.println ("Taxes payement of: " + amount);
		checkBalance();
	}
	
	private void checkBalance(){
		System.out.println (" Balance : " + balance);
	}
	
	public String toString(){
		return "[Name : " + name +"]\n[Email adress : " + email() + "]\n[UserID : "+ userID +"]\n[Balance : "+balance+"]";
	}
	
}