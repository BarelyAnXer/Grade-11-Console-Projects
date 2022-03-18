import java.util.*;
import java.io.*;
public class ReadFile {
	
	static Scanner x;
	static String a;
	static String b;
	static String c;
	
	public static void main (String[] args) {
		try{
			x = new Scanner(new File("ching.txt"));
		
		
		while(x.hasNext()){
			a = x.next();
			b = x.next();
			c = x.next();
			System.out.printf("%s %s %s\n", a,b,c);
		}
		
		x.close();
		}
		catch(Exception e){
			
		}
		
	}
    
    
}