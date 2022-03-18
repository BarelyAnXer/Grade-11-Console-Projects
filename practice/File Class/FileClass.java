import java.io.*;
import java.util.*;
import java.lang.*;
public class FileClass {
static Formatter x;
static Scanner y;
    public static void main(String args[]){
    	FileClass fileclass = new FileClass();
   		fileclass.createFile();
   		fileclass.addRecord();
   		fileclass.closeFile();
    	
    /*	try{
    		Formatter x = new Formatter("zye.txt");
    		System.out.print("Created a File");
    	}
    	catch(Exception e){
    		System.out.println("Error Occured");
    	}
    */	
    	
    	
    	
    /*	File x = new File("C:\\Users\\zye\\Desktop\\findAnswer.txt");	
    	if(x.exists()){
    		System.out.println(x.getName());
    		
    	}
    	else{
    		System.out.println("This File Does'nt Exist");
    	}
    */	
    	
    }
    
    public void createFile(){
    	try{
    		x = new Formatter("ching.txt");
    	}
    	catch(Exception e){
    		System.out.println("Error Occured");
    	}
  
    }
    public void addRecord(){
    	x.format("%s%s%s", "1 ","zyr ","fg\n"); 
    	x.format("%s%s%s", "2 ","qwe ","fg\n"); 
    	x.format("%s%s%s", "3 ","zyrs ","fg\n"); 
    	x.format("%s%s%s", "4 ","qwed ","fg\n"); 
    }
    public void closeFile(){
    	x.close();
    }
   
   public void openFile(){
   	try{
   		y = new Scanner(new File("ching.txt"));
   	}
   	catch(Exception e){
   		System.out.println("Error Occured");
   	}
   }
    
    	
    
    
    
}