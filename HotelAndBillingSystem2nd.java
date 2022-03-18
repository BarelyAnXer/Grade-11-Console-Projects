import java.util.*;
import java.io.*;

public class HotelAndBillingSystem2nd{
	static BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
	static ArrayList<String> client = new ArrayList<String>();
	static String yornch;//yes or no choice --lol
	
	
	
	static String uname;
	static String upass;
	static int clientCH;
	static int roomch;
	static int reservech;
	static int utilitych;
	//clients
	static String ID;
	static String FirstName;
	static String LastName;
	static String PhoneNumber;
	static String Email;
	//clients

	static ArrayList<String> rooms = new ArrayList<String>();
	//rooms
	static String rid;
	static String rty;
	static String reserved;
	//rooms
	
	//reservation
	static ArrayList<String> reservation = new ArrayList<String>();
	static String reservationid;
	static String clientid;
	static String roomno;//nnumber or id
	static String datein;
	static String dateout;
	//reservation
	//acc and pass validation
	static ArrayList<String> acc = new ArrayList<String>();
	static ArrayList<String> pass = new ArrayList<String>();
	
    public static void main (String[] args)throws IOException{
    	client.add("111");
		client.add("ex First");
	    client.add("ex LASt");
	    client.add("ex phone");
	    client.add("ex email");
	    rooms.add("1");//room number/id
		rooms.add("1");//room type
    	rooms.add("no");//reserved ?
    	reservation.add("22");
    	reservation.add("111");
    	reservation.add("32");
    	reservation.add("2/14/2019");
    	reservation.add("9/28/2004");
    	acc.add("zye");
    	acc.add("jaz");
    	pass.add("zye");
    	pass.add("jaz"); 
		Login();
    }
 	
 	

 	public static void Login()throws IOException{
			
		System.out.print("Enter USERNAME: ");
	   	uname =scan.readLine();
   		if(uname.length()==0){
   			do{
   				System.out.println("username is required");
   				System.out.print("Enter USERNAME: ");
   				uname =scan.readLine();
   			}while(uname.length()==0);
   		}
   		
   		System.out.print("Enter PASSWORD: ");
   		upass =scan.readLine();
   		if(upass.length()==0){
   			do{
   				System.out.println("password is required");
   				System.out.print("Enter PASSWORD: ");
   				upass =scan.readLine();
   			}while(upass.length()==0);
   		}

   		int pos1 = acc.indexOf(uname);
   		int pos2 = pass.indexOf(upass);
   		

		if(acc.contains(uname) && pass.contains(upass)){
   			if(pos1 == pos2){
	   			System.out.println("\nWelcome "+ uname);
	   			MainMenu();
	   		}
	   		else{
	   			System.out.println("Inavlid Username/Password");
	   			Login();
	   		}
		}
   		else{
   			System.out.println("Inavlid Username/Password");
   			Login();
   		} 	   		
    }

	
	public static void MainMenu()throws IOException{
		System.out.println("\nHOTEL RESERVATION & BILLING SYSTEM");
		System.out.println("[1] Clients");
		System.out.println("[2] Rooms");
		System.out.println("[3] Reservations");
		System.out.println("[4] Utilities");
		System.out.println("[5] Logout");
		System.out.println("[0] Exit System");
		System.out.print("\nEnter Choice: "); 

			int menuCH = Integer.parseInt(scan.readLine());

				if(menuCH == 1){
					ClientMenu();
				}
				else if(menuCH == 2){
					RoomMenu();
				}
				else if(menuCH == 3){
					ReservationMenu();
				}
				else if(menuCH == 4){
					UtilitiesMenu();
				}
				else if(menuCH == 5){
					Login();
				}
				else if(menuCH == 0){
					System.exit(0);
				}
				else{
					System.out.println("Invalid Input");
				}
				
				
					
	}
//clients class	
	public static void Clients()throws IOException{
		System.out.println("\n=========================");
		System.out.println("[1] Add Client");
	    System.out.println("[2] Edit Client");
	   	System.out.println("[3] Delete Client");
	   	System.out.println("[4] Search Client");
	   	System.out.println("[5] Display All Clients");
	   	System.out.println("[6] Go Back");
	   	System.out.println("[0] Exit System");
	   	System.out.println("=========================");
	   	System.out.print("Enter your Choice: ");
	   	
	    	int clientCH = Integer.parseInt(scan.readLine());
	    	switch(clientCH) {
	    		case 1: AddClient();					break;
	    		case 2: EditClient();					break;
	    		case 3: DeleteClient();					break;
	    		case 4: SearchClient();					break;
	    		case 5: DisplayAll();					break;
	    		case 6: MainMenu();
	    		case 0:	System.exit(0);break;	
	    		default:System.out.println("INVALID input"); ClientMenu();		
			}
	}
	
	public static void ClientMenu()throws IOException{
	do{
		System.out.println("\n=========================");
		System.out.println("[1] Add Client");
	    System.out.println("[2] Edit Client");
	   	System.out.println("[3] Delete Client");
	   	System.out.println("[4] Search Client");
	   	System.out.println("[5] Display All Client");
	   	System.out.println("[6] Go Back");
	   	System.out.println("[0] Exit System");
	   	System.out.println("=========================");
	   	System.out.print("Enter your Choice: ");
	   		clientCH = Integer.parseInt(scan.readLine());
		    	switch(clientCH) {
		    		case 1: AddClient();						break;
		    		case 2: EditClient();						break;
		    		case 3: DeleteClient();						break;
		    		case 4: SearchClient();						break;
		    		case 5: DisplayAll();						break;
		    		case 6: MainMenu();							break;
		    		case 0:	System.exit(0);   					break;	
		    		default:System.out.println("INVALID input sa switch ");
				}
		   		
	}while(clientCH != 6);
	   
 
	}
	
	public static void AddClient()throws IOException{
		System.out.print("Enter ID 			:");
	    ID = scan.readLine();
	    System.out.print("Enter FirstName   :");
	    FirstName = scan.readLine();
	    System.out.print("Enter LastName	:");
	    LastName = scan.readLine();
	    System.out.print("Enter Phone No    :");
	    PhoneNumber = scan.readLine();
	    System.out.print("Enter Email       :");
		Email = scan.readLine();
		client.add(ID);
	    client.add(FirstName);
	    client.add(LastName);
	    client.add(PhoneNumber);
	    client.add(Email);	
	    System.out.println("save this (Y/N)");
			    String choice = scan.readLine();
			    if(choice.equalsIgnoreCase("y")){
			    	System.out.println("record saved");
			    }else if(choice.equalsIgnoreCase("n")){
			    	System.out.println("record not saved");
			    	client.remove(ID);
			    	client.remove(FirstName);
			    	client.remove(LastName);
			    	client.remove(PhoneNumber);
			    	client.remove(Email);
			    }
			    else{
			    	System.out.println("invalid input");
			    }
			    System.out.println("add again y/n");
			    String ifchoice= scan.readLine();
			    if(ifchoice.equals("y")){
			    	AddClient();
			    }
			    else{
			    	System.out.println("invalid input");
			    }
	}
	
	public static void DisplayAll(){
		System.out.println("ID\t\t\tFIRST NAME\t\t\t LAST NAME\t\t\tPHONE NO\t\t\t EMAIL");
		for(int i = 0; i < client.size(); i++){
			for(int j=0;j < client.size();j+=5){
				if(i == j){
				System.out.println("\n");
				break;
				}	
			}
			System.out.print(client.get(i)+"\t\t\t");	
		}  
	}
	
	public static void DeleteClient()throws IOException{
		System.out.print("Enter id of the client you want to delete:  ");
		String c5 =scan.readLine();
		int pos1 =client.indexOf(c5);
		int pos2 = pos1+5;
		if(client.contains(c5)){
			for (int initial = pos1; initial < pos2 ; initial++){
				client.remove(pos1);
			}
			System.out.println("CLIENT DELETED");
		}
		else{
			System.out.println("CLIENT DOES NOT EXIST");
		}
		
	}
	
		public static void EditClient()throws IOException{
		System.out.print("Enter id of the client you want to edit:  ");
		String c3 =scan.readLine();
		int pos1 =client.indexOf(c3);
		int pos2 =pos1+1;
		int pos3 =pos1+2;
		int pos4 =pos1+3;
		int pos5 =pos1+4;
		for (int initial = pos1; initial <client.size(); initial++){
			if(client.contains(c3)){
			    System.out.print("Enter new FirstName   :");
			    FirstName = scan.readLine();
			    System.out.print("Enter new LastName	:");
			    LastName = scan.readLine();
			    System.out.print("Enter Phone No new    :");
			    PhoneNumber = scan.readLine();
			    System.out.print("Enter Email new    :");
				Email = scan.readLine();

			
			client.set(pos2,FirstName);
			client.set(pos3,LastName);
			client.set(pos4,PhoneNumber);
			client.set(pos5,Email);
			break;

		
			}
		}			
	}
	
	
	public 	static void SearchClient()throws IOException{
		System.out.print("ENTER THE ID OF CLIENT YOU WANT TO FIND: ");
		String ch =scan.readLine();
		int pos1 =client.indexOf(ch);
		int pos2 =pos1+1;
		int pos3 =pos1+2;
		int pos4 =pos1+3;
		int pos5 =pos1+4;
		if(client.contains(ch)){
			System.out.println("ID			: " + client.get(pos1));
			System.out.println("FirstName	: " + client.get(pos2));
			System.out.println("LastName	: " + client.get(pos3));
			System.out.println("phone num	: " + client.get(pos4));
			System.out.println("email		: " + client.get(pos5));
		}
		else{
			System.out.println("CLIENT NOT FOUND");
			ClientMenu();
		}
	}
//end of client class

// roooms class
	public static void RoomMenu()throws IOException{
	do{
		System.out.println("\n=========================");
		System.out.println("[1]View Room types");
		System.out.println("[2]Add Room");
		System.out.println("[3]Edit Room");
		System.out.println("[4]Remove Room");
		System.out.println("[5]Display Room");
		System.out.println("[6]Go Back");
		System.out.println("[0] Exit System");
		System.out.println("=========================");
		System.out.print("\nEnter choice: ");
		roomch = Integer.parseInt(scan.readLine());
		
		switch(roomch) {
			case 1: ViewRoomTypes(); 	break;
			case 2: AddRoom();			break;
			case 3: EditRoom(); 		break;
			case 4: RemoveRoom();		break;
			case 5: DisplayRoom(); 		break;
			case 6:	MainMenu();			break;
			case 0:	System.exit(0);		break;	
		}
	}while(roomch != 6);
		
	}
	
	public static void ViewRoomTypes(){
		System.out.print("Type ID\t\t");
		System.out.print("Label\t\t\t");
		System.out.println("Price\t\t");
		System.out.print("01\t\t\t");
		System.out.print("single\t\t\t");
		System.out.println("100\t\t\t");
		System.out.print("02\t\t\t");
		System.out.print("double\t\t\t");
		System.out.println("200\t\t\t");
		System.out.print("03\t\t\t");
		System.out.print("triple\t\t\t");
		System.out.println("300\t\t\t");
		System.out.print("04\t\t\t");
		System.out.print("family\t\t\t");
		System.out.println("400\t\t\t");
		System.out.print("05\t\t\t");
		System.out.print("suite\t\t\t");
		System.out.println("500\t\t\t");	
	}
	public static void AddRoom()throws IOException{
			System.out.print("Enter room number		:");
		    rid= scan.readLine();
		    System.out.print("Enter room type ID  :");
		    rty= scan.readLine();
		    System.out.print("Reserved   :");
		    reserved= scan.readLine();
			rooms.add(rid);
		    rooms.add(rty);
		    rooms.add(reserved);	   
	}
	public static void DisplayRoom(){
		
		for(int i = 0; i < rooms.size(); i++){
			for(int j=0;j < rooms.size();j+=3){
				if(i == j){
				System.out.println("");
				break;
				}	
			}
			System.out.print(rooms.get(i)+"\t\t\t");	
		}  
	}
	
	public static void RemoveRoom()throws IOException{
		System.out.print("Enter the Room ID of the room you want to delete:  ");
		String c5 =scan.readLine();
		int pos1 =rooms.indexOf(c5);
		int pos2 = pos1+3;
		if(rooms.contains(c5)){
			for (int initial = pos1; initial < pos2 ; initial++){
				rooms.remove(pos1);
			}
			System.out.println("ROOM DELETED");
		}
		else{
			System.out.println("ROOM DOES NOT EXIST");
		}
	}
	
	public static void EditRoom()throws IOException{
		System.out.print("Enter	room number of the room you want to edit:  ");
		String c3 =scan.readLine();
		int pos1 =rooms.indexOf(c3);
		int pos2 =pos1+1;
		int pos3 =pos1+2;
		for (int initial = pos1; initial <rooms.size(); initial++){
			if(rooms.contains(c3)){
			    System.out.print("Enter new id type    :");
			    rty = scan.readLine();
			    System.out.print("Enter new reserve status    :");
				reserved = scan.readLine();
			rooms.set(pos2,rty);
			rooms.set(pos3,reserved);
			break;
	
			}
		}
	}

//end of rooms class


//reservation class
   public static void ReservationMenu()throws IOException{
   	do{
   		System.out.println("\n=========================");
   		System.out.println("[1]Add Reservation");
    	System.out.println("[2]Edit Reservation");
    	System.out.println("[3]Remove Reservation");
    	System.out.println("[4]Display Reservation");
    	System.out.println("[5]Go Back");
    	System.out.println("[0]Exit System");
    	System.out.println("=========================");
    	System.out.print("\nEnter choice: ");
    	reservech = Integer.parseInt(scan.readLine());
    	switch(reservech){
    		case 1:  AddReservation();break;
    		case 2:  EditReservation();break;
    		case 3:  RemoveReservation();break;
    		case 4: DisplayReservation();break;
    		case 5:  MainMenu();break;
    		case 0:	System.exit(0);break;
    	}
   	}while(reservech != 5);
    	
    }
    
    public static void AddReservation()throws IOException{
    		System.out.print("Enter reservation id	:");
		    reservationid = scan.readLine();
		    System.out.print("Enter client id		:");
		    clientid = scan.readLine();
		    System.out.print("Enter rooom no		:");
		    roomno = scan.readLine();
		    System.out.print("Enter date-in			:");
		    datein = scan.readLine();
		    System.out.print("Enter date-out 		:");
		    dateout = scan.readLine();
		    
		    reservation.add(reservationid);
		    reservation.add(clientid);
		    reservation.add(roomno);
		    reservation.add(datein);
		    reservation.add(dateout);
		    
		    int pos1 =rooms.indexOf(rid);
			int pos2 = pos1+3;
		    
		    rooms.set(pos2,"yes");
		    
		    
    }
    
    public static void DisplayReservation(){
    	
    	for(int i = 0; i < reservation.size(); i++){
			for(int j=0;j < reservation.size();j+=5){
				if(i == j){
				System.out.println("");
				break;
				}	
			}
			System.out.print(reservation.get(i)+"\t\t\t");	
		}  
    }
    public static void EditReservation()throws IOException{
    	System.out.print("Enter	reservation id you want to edit:  ");
		String c3 =scan.readLine();
		int pos1 =reservation.indexOf(c3);
		int pos2 =pos1+1;
		int pos3 =pos1+2;
		int pos4 =pos1+3;
		int pos5 =pos1+4;
		for (int initial = pos1; initial < reservation.size(); initial++){
			if(reservation.contains(c3)){
			    System.out.print("Enter new id type    :");
			    clientid = scan.readLine();
			    System.out.print("Enter new reserve status    :");
				roomno = scan.readLine();
				System.out.print("Enter new reserve status    :");
				datein = scan.readLine();
				System.out.print("Enter new reserve status    :");
				dateout = scan.readLine();
			reservation.set(pos2,clientid);
			reservation.set(pos3,roomno);
			reservation.set(pos4,datein);
			reservation.set(pos5,dateout);
			
			break;

			}
		}
    }
    
    public static void RemoveReservation()throws IOException{
    	System.out.print("Enter the Room ID of the room you want to delete:  ");
		String c5 =scan.readLine();
		int pos1 =reservation.indexOf(c5);
		int pos2 = pos1+5;
		if(reservation.contains(c5)){
			for (int initial = pos1; initial < pos2 ; initial++){
				reservation.remove(pos1);
			}
			System.out.println("RESERVATION DELETED");
		}
		else{
			System.out.println("RESERVATION DOES NOT EXIST");
		}
    }



//end of reservation class


//utilities
	public static void UtilitiesMenu()throws IOException{
		System.out.println("\n=========================");
   		System.out.println("[1]Change Password");
    	System.out.println("[2]Go Back");
    	System.out.println("[0]Exit System");
    	System.out.println("=========================");
    	System.out.print("\nEnter choice: ");
		utilitych = Integer.parseInt(scan.readLine());
		switch(utilitych) {
		    		case 1: changepass();			break;
		    		case 2: MainMenu();			break;
		    		case 0:	System.exit(0);   			break;	
				
		}
	}
	public static void changepass()throws IOException{
		System.out.print("Enter Your Username: ");
    	uname = scan.readLine();
    	if(acc.contains(uname)){
    		int pos1 =acc.indexOf(uname);
			System.out.print("Enter New Password: ");
	    	String newpass = scan.readLine();
	    	pass.set(pos1,newpass);
	    	System.out.println("Password Changed");
	    	System.out.println("Password Has Been Changed");
	    	System.out.println("Your account will logout after a few secons pls relogin");
	    	try{
	    		Thread.sleep(3000);
	    	}
	    	catch(InterruptedException e){
	    		System.out.println("error catched");	
	    	}
	    	Login();
    	}
    	else{
    		System.out.println("Account Does Not Exist");
    		System.out.println("Do You Want To Try Again(Y/N)?");
    		String yornch = scan.readLine();
    		if(yornch.equalsIgnoreCase("y")){
    			changepass();
    		}
    		else if(yornch.equalsIgnoreCase("n")){
    			UtilitiesMenu();
    		}
    		else if(yornch.length()==0){
    			System.out.println("Choice Is Required");
    			System.out.println("Do You Want To Try Again(Y/N)?");
    			yornch = scan.readLine();
    				
    		}
    		else{
    			System.out.println("Inavlid Input");
    			UtilitiesMenu();
    		}
    		
    	}	
    }
    
    public static void miniif()throws IOException{
    	if(yornch.equalsIgnoreCase("y")){
    			changepass();
    	}
		else if(yornch.equalsIgnoreCase("n")){
			UtilitiesMenu();
		}
		else if(yornch.length()==0){
			System.out.println("Choice Is Required");
			System.out.println("Do You Want To Try Again(Y/N)?");
			String yornch = scan.readLine();
		}
		else{
			System.out.println("Inavlid Input");
			UtilitiesMenu();
		}
    }
//end of utilities class
	
	
}
