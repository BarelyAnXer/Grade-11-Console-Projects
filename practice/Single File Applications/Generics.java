public class Generics {

    public static void main(String args[]){
		Integer[] aint = {1,2,3,4,5};
    	char[] achar = {'a','f','d','s','a'};
		int integer = 29;
		String string = "asfd";
		printme(aint);
		printame(string);

    }
    
    public static <T> void printme(T[] x){
   	for (T item: x) {
         System.out.println(item);
      }	
    }
    
    public static <T> void printame(T x){
   	
         System.out.println(x);
     
    }
}	