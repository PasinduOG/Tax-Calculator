import java.util.*;
class TaxCalculator{
	public static void withHoldingTax(Scanner scanner){
		System.out.println("+---------------------------------------------------------+");
		System.out.println("|                     Withholding Tax                     |");
		System.out.println("+---------------------------------------------------------+\n");
		
		System.out.println("\t[1] Rent Tax\n");
		System.out.println("\t[2] Bank Interest Tax\n");
		System.out.println("\t[3] Dividend Tax\n");
		System.out.println("\t[4] Exit\n\n");
		
		System.out.print("Enter an option to continue -> ");
		int option=scanner.nextInt();
		String option1="";
		
		switch(option){
			case 1 :
				do{
					clearScreen();
					System.out.println("+--------------------------------------------------+");
					System.out.println("|                     Rent Tax                     |");
					System.out.println("+--------------------------------------------------+\n");
			
					System.out.print("Enter your rent           : ");
					double rent=scanner.nextInt();
				
					if(rent<0){
						System.out.println("\n\tInvalid input...\n\n\n");
					}else if(rent>0 && rent<=100000){
						System.out.println("\n\tYou dont have to pay rent tax...\n\n\n");
					}else{
						System.out.println("\nYou have to pay rent tax  : "+((rent-100000)*0.1)+"\n\n\n");
					}
					
					System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
					option1=scanner.next().toUpperCase();
					
					if(option1.equals("N")){
						clearScreen();
						mainMenu(scanner);
					}
					
				}while(option1.equals("Y"));
				
			case 2 :
				do{
					clearScreen();
					System.out.println("Badu wada");
					
					System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
					option1=scanner.next().toUpperCase();
					
					if(option1.equals("N")){
						clearScreen();
						mainMenu(scanner);
					}
				}while(option1.equals("Y"));
			case 3 :
				do{
					clearScreen();
					System.out.println("Badu wada");
					
					System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
					option1=scanner.next().toUpperCase();
					
					if(option1.equals("N")){
						clearScreen();
						mainMenu(scanner);
					}
				}while(option1.equals("Y"));
			case 4 :
				//clearScreen();
		}
	}
	
	public static void mainMenu(Scanner scanner){
		String option1="";
		do{
			clearScreen();
			System.out.println("					   __   ______   ________  ________ ");
			System.out.println("					  |  \\ /      \\ |        \\|        \\ ");
			System.out.println("					   \\$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$ ");
			System.out.println("					  |  \\| $$   \\$$| $$__       | $$   ");
			System.out.println("					  | $$| $$      | $$  \\      | $$   ");
			System.out.println("					  | $$| $$   __ | $$$$$      | $$   ");
			System.out.println("					  | $$| $$__/  \\| $$_____    | $$   ");
			System.out.println("					  | $$ \\$$    $$| $$     \\   | $$   ");
			System.out.println(" 					   \\$$  \\$$$$$$  \\$$$$$$$$    \\$$   \n");
			System.out.println("  _______          __   __     _____              _        _____  _    _   _               _______   ____    _____  ");
			System.out.println(" |__   __|  /\\     \\ \\ / /    / ____|     /\\     | |      / ____|| |  | | | |         /\\  |__   __| / __ \\  |  __ \\ ");
			System.out.println("    | |    /  \\     \\ V /    | |         /  \\    | |     | |     | |  | | | |        /  \\    | |   | |  | | | |__) |");
			System.out.println("    | |   / /\\ \\     > <     | |        / /\\ \\   | |     | |     | |  | | | |       / /\\ \\   | |   | |  | | |  _  / ");
			System.out.println("    | |  / ____ \\   / . \\    | |____   / ____ \\  | |____ | |____ | |__| | | |____  / ____ \\  | |   | |__| | | | \\ \\ ");
			System.out.println("    |_| /_/    \\_\\ /_/ \\_\\    \\_____| /_/    \\_\\ |______| \\_____| \\____/  |______|/_/    \\_\\ |_|    \\____/  |_|  \\_\\ \n");
			System.out.println("=========================================================================================================================\n\n");
			
			System.out.println("\t[1] Withholding Tax\n");
			System.out.println("\t[2] Payable Tax\n");
			System.out.println("\t[3] Income Tax\n");
			System.out.println("\t[4] Social Security Contribution Levy (SSCL) Tax\n");
			System.out.println("\t[5] Leasing Payment\n");
			System.out.println("\t[6] Exit\n\n");
			
			System.out.print("Enter an option to continue -> ");
			int option=scanner.nextInt();
		
			switch(option){
				case 1 :
					clearScreen();
					withHoldingTax(scanner);
				default :
					System.out.println("\n\tInvalid option...\n\n");
					
					System.out.print("Do you want to try again (Y/N) : ");
					option1=scanner.next().toUpperCase();
			}
			
		}while(option1.equals("Y"));
	}
	
	public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
	}
	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		mainMenu(scanner);
	}
}
