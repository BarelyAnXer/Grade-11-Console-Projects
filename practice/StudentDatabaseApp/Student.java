import java.util.*;
public class Student extends StudentDatabaseApp{
	private String firstName;
	private String lastName;
	private String classLevel;
	private String studentId;
	private String courses = "";
	private int tutionBalance = 0;
	private int costOfCourse = 600;
	private static int id  = 1000;
	
	
	public String getStudentId(){
		return studentId;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setClassLevel(String classLevel){
		this.classLevel = classLevel;
	}
	
	
	
	
	
    public Student(){
    	
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter student first name: ");
    	this.firstName = input.nextLine();
    	
    	System.out.print("Enter student last name: ");
    	this.lastName = input.nextLine();
    	
    	System.out.print("1 - Freshmen\n2 - Sophomore\n3  - Junior\n4 - Senior Enter \nstudent class level: ");
    	this.classLevel = input.nextLine();
    	
    	setStudentID();
    	
    	System.out.println(firstName + " " + lastName + " " + classLevel + " " + studentId);
    	
    	
    }
    
    private void setStudentID(){
    	id++;
    	this.studentId = classLevel + "" + id;
    }
    
    public void enroll(){
    	do{
    		System.out.print("Enter a course to enroll (Q to quit): ");
	    	Scanner input = new Scanner(System.in);
	    	String course = input.nextLine();
	    	
	    	if(!course.equalsIgnoreCase("q")){
	    		this.courses = this.courses + "\n" + course;
	    		this.tutionBalance = this.tutionBalance + this.costOfCourse; 
	    	}
	    	else{
	    		break;
	    	}
    	}while(1 != 0);
	    	
	    	
    	System.out.println("Enrolled in : " + this.courses);
    	System.out.println("Tution Balance: " + tutionBalance);
    }
	
	public void viewBalance(){
		System.out.println("Your balance is: $" + this.tutionBalance);
	}   
	
	public void payTution(){	
		viewBalance();
		System.out.print("Enter your payment : $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		this.tutionBalance = this.tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	
	 
	public String toString(){
		return "Name :" + this.firstName + " " + this.lastName + 
				"\nCourses Enrolled:" + this.courses + 
				"\nBalance: $" + this.tutionBalance; 
	} 
    
}