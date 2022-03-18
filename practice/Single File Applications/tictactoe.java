import java.util.Scanner;
public class tictactoe {
static Scanner scan = new Scanner(System.in);
static String p1 = "[x]";
static String p2 = "[o]";
static String board[][]	={{"[1]","[2]","[3]"},
		  				  {"[4]","[5]","[6]"},
		  				  {"[7]","[8]","[9]"}};		

static int location;
static int y = 0;
static int x = 0;
static String state = "";

	public static void drawboard() {
		for(int x =0;x<board.length;x++) {
			for(int y = 0;y<board.length;y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
	}
	public static String xoro(int pl) {
		
		if(pl%2 ==0) {
			return "[x]";
		}
		else {
			return "[o]";
		}
	}
	
		
	public static void mainy() {
		do {
			try{
				location = scan.nextInt();
				if(location > 9 || location < 1){
					System.out.println("1-9 only");
					System.out.println("try again");
					 	
				}
			}catch(Exception e){
				System.out.println("error");
				System.exit(0);
			}	
			// invalid input problem 	
			if(location == 1) {
				if(board[0][0].contains("x") || board[0][0].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[0][0] = xoro(y);
				}
			
			}
			else if(location == 2) {
				if(board[0][1].contains("x") || board[0][1].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[0][1] = xoro(y);
				}
			}
			else if(location == 3) {
				if(board[0][2].contains("x") || board[0][2].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[0][2] = xoro(y);
				}	
			}
			else if(location == 4) {
				if(board[1][0].contains("x") || board[1][0].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[1][0] = xoro(y);
				}	
			}
			else if(location == 5) {
				if(board[1][1].contains("x") || board[1][1].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[1][1] = xoro(y);
				}
			}
			else if(location == 6) {
				if(board[1][2].contains("x") || board[1][2].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[1][2] = xoro(y);
				}
			}
			else if(location == 7) {
				if(board[2][0].contains("x") || board[2][0].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[2][0] = xoro(y);
				}
			}
			else if(location == 8) {
				if(board[2][1].contains("x") || board[2][1].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[2][1] = xoro(y);
				}	
			}
			else if(location == 9) {
				if(board[2][2].contains("x") || board[2][2].contains("o")){
					System.out.println("meron nang laman");
					System.out.println("pili ka ulit iba");
					mainy();
				}
				else{
					board[2][2] = xoro(y);
				}
			}
			x++;
			y++;
			drawboard();
			if(board[0][0].contains("x") && board[0][1].contains("x") && board[0][2].contains("x")){
				System.out.println("x wins");
				System.exit(0);			

			}
			else if(board[1][0].contains("x") && board[1][1].contains("x") && board[1][2].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}
			else if(board[2][0].contains("x") && board[2][1].contains("x") && board[2][2].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}
			else if(board[0][0].contains("x") && board[1][0].contains("x") && board[2][0].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}
			else if(board[0][1].contains("x") && board[1][1].contains("x") && board[2][1].contains("x")){
				System.out.println("x wins");
			System.exit(0);
			}
			else if(board[1][2].contains("x") && board[1][2].contains("x") && board[2][2].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}
			else if(board[0][0].contains("x") && board[1][1].contains("x") && board[2][2].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}
			else if(board[0][2].contains("x") && board[1][1].contains("x") && board[2][0].contains("x")){
				System.out.println("x wins");
				System.exit(0);
			}	
				
			else if(board[0][0].contains("o") && board[0][1].contains("o") && board[0][2].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[1][0].contains("o") && board[1][1].contains("o") && board[1][2].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[2][0].contains("o") && board[2][1].contains("o") && board[2][2].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[0][0].contains("o") && board[1][0].contains("o") && board[2][0].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[0][1].contains("o") && board[1][1].contains("o") && board[2][1].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[0][2].contains("o") && board[1][2].contains("o") && board[2][2].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[0][0].contains("o") && board[1][1].contains("o") && board[2][2].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
			else if(board[0][2].contains("o") && board[1][1].contains("o") && board[2][0].contains("o")){
				System.out.println("o wins");
				System.exit(0);
			}
		}while(x != 9);
		System.out.println("its a draw");
	}
	
	
	public static void main(String args[]) {
	
		
		drawboard();
		mainy();
		
		
		
		
		
		
		
		
	}
}
