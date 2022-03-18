import java.util.*;
import java.io.*;
public class StudentDatabaseApp {
static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
static ArrayList<Student> list = new ArrayList<Student>();
    public static void main(String args[])throws IOException,ConcurrentModificationException{
		
	/*	ArrayList<String> accss = new ArrayList<String>();
		ArrayList<String> passs = new ArrayList<String>();
		
		
		
    	File file = new File("test.txt");
    	PrintWriter pw = new PrintWriter(file);
    	
		pw.printf("bruhasda yasddow");
		pw.println();
		pw.printf("bruh yow");
		pw.println();
		pw.printf("bruh yow");
		pw.println();
		pw.printf("bruh yow");
		
		// this one works??
		
    	pw.close();
    	
    	/*try buaks ng nakaprint ng nakaganto yunbg acc and pass sa txt file
    	 *acc1,pass1
    	 *acc2,pass2
    	 *aralin pano iread yan ng naka gaynan
    	
    	Scanner output = new Scanner(file);
		
		String temp = "temp1,temp2";
		while(output.hasNextLine()){
			accss.add(output.next());
			passs.add(output.next());
		}
		
		System.out.println(accss);
		System.out.println(passs);
*/
    
    	
    	
		System.out.print("Enter number of new students to enroll: ");
		
		int numOfStudents = Integer.parseInt(input.readLine());
		
		addStudent(numOfStudents);
		
		System.out.println("id of you want to delete");
		String newID = input.readLine();
		deleteStudent(newID);
		
		System.out.println("search deleted student");
		String newnew = input.readLine();
		searchStudent(newnew);
		
		
		
	}
	public static void addStudent(int numOfStudents){
		for(int i = 0; i < numOfStudents; i++){
			list.add(new Student());
			list.get(i).enroll();
		}
	}
	
	public static void searchStudent(String id){
		for(Student s : list){
			if(s.getStudentId().equals(id)){
				System.out.println(s.toString());
			}
		}	
	}
	
	public static void editStudent(String id)throws IOException{
		for(Student s : list){
			if(s.getStudentId().equals(id)){
				System.out.println("First Name: ");
				String fn = input.readLine();
				s.setFirstName(fn);
				System.out.println("Last Name: ");
				String ln = input.readLine();
				s.setLastName(ln);
				System.out.println("Class Level: ");
				String cl = input.readLine();
				s.setClassLevel(cl);
				
				//bugs 
				/*
				 *pag iniba yung class level maiiba rin yung id kasi kung ano piniling class leve
				 *yun simula ng id
				 */
				 
				 /*try irun sa ibang comuper or laptop yung sunodsunod na input.readline or next line 
				  *bakit di gumagana pag walang syout*/
				  
			}
		}
	}
	
	public static void deleteStudent(String id){
		for(Student s : list){
			if(s.getStudentId().equals(id)){
				int pos = list.indexOf(s);
				System.out.print(pos);
				list.trimToSize();
				list.remove(pos);
			}
		}
	}
}
