interface info{
	public void showInfo();
}
class Machine implements info{
	private int id = 1;
		
	public void Start(){
		System.out.println("Machine Started");
	}
	
	public void Stop(){
		System.out.println("Machine Stopped");
	}
	
	public void showInfo(){
		System.out.println("Machine id is " + id);
	}
	
}
/*
class Car extends Machine{
	public void wipeWindShield(){
		System.out.println("Wiping Wind Shield");
	}
	
	@Override
	public void Start(){
		System.out.println("Car Started");
	}
	
	public void showInfo(){
		System.out.println("Car name: ");
	}
	
}*/

class Person implements info{
	private String name;
	public Person(String name){
		this.name = name;
	} 
	
	public void greet(){
		System.out.println("hello there");
	}	
		
	public void showInfo(){
		System.out.println("person name" + name);
	}
		
}



// dont override variables only method horrible idea if you try to override variables
public class prac {

    public static void main(String args[]){
    	Machine mach1 = new Machine();
    	mach1.Start();
    	
    	Person person1 = new Person("BOB");
    	
    	info info1 = new Machine();
    	info1.showInfo();
    	
    	info info2 = person1;
    	info2.showInfo();
    	outputInfo(mach1);
    	outputInfo(person1);
    	
    }
    
    private static void outputInfo(info infoa){
    	infoa.showInfo();
    }
}