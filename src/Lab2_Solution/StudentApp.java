package Lab2_Solution;

public class StudentApp {

	public static void main(String[] args) {
		
		// Create new student
		Student stu1 =  new Student("Janelle","7545458758");
		Student stu2 =  new Student("Thomas","12344354387654");
		Student stu3 =  new Student("Elisabeth","743658475637");
		
		stu1.enroll("Mathematics");
		stu1.enroll("Science");
		stu1.enroll("History");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.payTuition(600);
		stu1.checkBalance();
		
		System.out.println(stu1.toString());

	}
}


//******************************************************


class Student {
	//Properties
	
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String phone;
	private String state;
	private String city;
	private String email;
	public String courses = "";
	public static final int costOfCourse = 800; // final - it will belong to the each stundent
	private int  balance = 0;
	
	//**********************************************
	
	//Constructor
	//   this.name is referring to the incidens of a local variable
	 
	public Student( String name, String ssn){
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	private void setEmail(){
		email = name.toLowerCase() + "." + iD + "@sduniversity.com";
		System.out.println("Your email is : " + email);
	}
	
	private void setUserId (){
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random()*((max-min)));
		randNum = randNum + min;// be sure is above the min
		userId = iD + "" + randNum  +ssn.substring(ssn.length()-4);
		System.out.println("You're user ID is : " + userId);
	}
	
	public void enroll( String course){
		this.courses = this.courses + "   " + course;
		//each time he enrolls teh cost of course should be added
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount){
		System.out.println("Payement: " + amount);
		balance = balance -amount;
		
	}
	
	public void checkBalance(){
		System.out.println("Balance : " + balance);
		
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	public String toString(){
		return "[NAME: " + name + "]\n[COURSES :" + courses  + "]\n[BALANCE: "+ balance + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}

