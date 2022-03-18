import java.util.*;
public class Email extends EmailApp{
	// pag inextends mo sa email app (Parent na may main pwede pala mag run kahit wala public static void main ...)
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private String email;
	private String companySuffix = "company.com";
	private int mailboxCapacity = 500;
	private int lengeth;
	private int defaultPasswordLength = 8;
	
	
    public Email(String firstName, String lastName) {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	
    	this.department = setDepartment();
    	System.out.println("Department: " + this.department);
    	
    	this.password = randPass(defaultPasswordLength);
    	System.out.println("Your password is: " + this.password);
    	
    	email = this.firstName.toLowerCase()	+ "." + this.lastName.toLowerCase() + "@" + department + "." + companySuffix;
    	System.out.println("Your Email is: " + email);
    	
    		
    }
    private String setDepartment(){
    	System.out.print("New worker : " + firstName + ". Department Codes:\n1 for Sales \n2 for Developtment \n3 for Accounting\n0 for none\nEnter department code: ");
    	Scanner input = new Scanner(System.in);
    	int depChoice = input.nextInt();
    	if(depChoice == 1){
    		return "sales";	
    	}
    	else if(depChoice == 2){
    		return "dev";
    	}
    	else if(depChoice == 3){
    		return "acct";
    	}
    	else{
    		return "";
    	}	
    }
    
    private String randPass(int length){
    	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#";
    	char[] password = new char[length];
    	for(int i = 0; i < length; i++){
    		int rand = (int) (Math.random() * passwordSet.length());
    		password[i] = passwordSet.charAt(rand);
    	}
    	return new String(password);
    		
    }
    
    public void setMailboxCapacity(int capacity){
 		this.mailboxCapacity = capacity;
    }
    
    public void setAlternateEmail(String altEmail){
    	this.alternateEmail = altEmail;
    }
    
    public void changePassword(String password){
    	this.password = password;
    }
    
    public int getMailboxCapacity(){
    	return mailboxCapacity;
    }
    public String getAlternateEmail(){
    	return alternateEmail;
    }
    public String getPassword(){
    	return password;
    }
    
    public String showInfo(){
    	return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
    			"COMPANY EMAIL: " + email + "\n" +
    			"MAILBOX CAPACITY: " + mailboxCapacity + "mb" + "\n";
    }
    
    
    
    
    
    
}