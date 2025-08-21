import java.util.*;
class TaxCalculator{
	public static void withHoldingTax(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+---------------------------------------------------------+");
			System.out.println("|                     WITHHOLDING TAX                     |");
			System.out.println("+---------------------------------------------------------+\n");
			
			System.out.println("\t[1] Rent Tax\n");
			System.out.println("\t[2] Bank Interest Tax\n");
			System.out.println("\t[3] Dividend Tax\n");
			System.out.println("\t[4] Exit\n\n");
			
			System.out.print("Enter an option to continue -> ");
			int option=scanner.nextInt();
		
			switch(option){
				case 1 :
					calculateRentTax();
					break;
				case 2 :
					calculateBankInterestTax();
					break;
				case 3 :
					calculateDividendTax();
					break;
				case 4 :
					return;
				default :
					System.out.println("\n\tInvalid option...\n\n");
					System.out.print("Do you want to try again? (Y/N) : ");
					String retry=scanner.next().toUpperCase();
					if(retry.equals("Y")){
						continue L1;
					}else{
						break L1;
					}
			}
		}while(true);
	}
	
	public static void calculateRentTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+--------------------------------------------------+");
			System.out.println("|                     RENT TAX                     |");
			System.out.println("+--------------------------------------------------+\n");
			
			System.out.print("Enter your rent           : ");
			double rent=scanner.nextInt();
			
			if(rent<0) {
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(rent>0 && rent<=100000) {
				System.out.println("\n\tYou dont have to pay rent tax...\n\n\n");
			}else {
				System.out.printf("\nYou have to pay rent tax  : %.2f\n\n\n", (rent-100000)*0.1);
			}
			System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
	}
	
	public static void calculateBankInterestTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-----------------------------------------------------------+");
			System.out.println("|                     BANK INTEREST TAX                     |");
			System.out.println("+-----------------------------------------------------------+\n");
			
			System.out.print("Enter your bank interest per year          : ");
			double interest=scanner.nextInt();
			
			if(interest<0){
				System.out.println("\n\tInvalid input...\n\n\n");
			}else{
				System.out.printf("\nYou have to pay Bank Interest Tax per year : %.2f\n\n\n",interest*0.05);
			}
			
			System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
	}
	
	public static void calculateDividendTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+------------------------------------------------------+");
			System.out.println("|                     DIVIDEND TAX                     |");
			System.out.println("+------------------------------------------------------+\n");
			
			System.out.print("Enter your total dividend per year    : ");
			double dividend=scanner.nextInt();
			
			if(dividend<0) {
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(dividend>0 && dividend<=100000) {
				System.out.println("\n\tYou dont have to pay Dividend Tax...\n\n\n");
			}else {
				System.out.printf("\nYou have to pay Dividend Tax per year : %.2f\n\n\n", (dividend-100000)*0.14);
			}
			System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
	}
	
	public static void mainMenu(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
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
					withHoldingTax();
					break;
				case 5 :
					System.out.println("\n\tTHANK YOU FOR USING TAX CALCULATOR...");
					System.out.println("\n\t\tHAVE A NICE DAY...!!!");
					return;
				default :
					System.out.println("\n\tInvalid option...\n\n");
					System.out.print("Do you want to try again? (Y/N) : ");
					String retry=scanner.next().toUpperCase();
					if(retry.equals("N")){
						System.out.println("\n\tTHANK YOU FOR USING TAX CALCULATOR...");
						System.out.println("\n\t\tHAVE A NICE DAY...!!!");
						break L1;
					}else{
						continue L1;
					}
			}
		}while(true);
	}
	
	public static void main(String args[]){
		mainMenu();
	}
	
	public static void clearConsole(){
		try{
			final String os=System.getProperty("os.name");
			if(os.contains("Windows")){
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			}else{
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		}catch(final Exception e){
			e.printStackTrace();
		}
	}
}
