import java.util.*;
class TaxCalculator{
	public static double getRentTax(double rent){
		return (rent-100000)*0.1;
	}
	
	public static double getBankInterestTax(double interest){
		return interest*0.05;
	}
	
	public static double getDividendTax(double dividend){
		return (dividend-100000)*0.14;
	}
	
	public static double getPayableTax(double payment){
		if(payment>100000 && payment<=141667){
			return (41667*0.06)-(141667-payment)*0.06;
		}else if(payment>141667 && payment<=183333){
			return (41667*0.12)+(41667*0.06)-(183333-payment)*0.12;
		}else if(payment>183333 && payment<=225000){
			return (41667*0.18)+(41667*0.12)+(41667*0.06)-(225000-payment)*0.18;
		}else if(payment>225000 && payment<=266667){
			return (41667*0.24)+(41667*0.18)+(41667*0.12)+(41667*0.06)-(266667-payment)*0.24;
		}else if(payment>266667 && payment<=308333){
			return (41667*0.30)+(41667*0.24)+(41667*0.18)+(41667*0.12)+(41667*0.06)-(308333-payment)*0.30;
		}else{
			return (41667*0.30)+(41667*0.24)+(41667*0.18)+(41667*0.12)+(41667*0.06)-(308333-payment)*0.36;
		}
	}
	
	public static double getIncomeTax(double income){
		if(income>1200000 && income<=1700000){
			return (500000*0.06)-(1700000-income)*0.06;
		}else if(income>1700000 && income<=2200000){
			return (500000*0.12)+(500000*0.06)-(2200000-income)*0.12;
		}else if(income>2200000 && income<=2700000){
			return (500000*0.18)+(500000*0.12)+(500000*0.06)-(2700000-income)*0.18;
		}else if(income>2700000 && income<=3200000){
			return (500000*0.24)+(500000*0.18)+(500000*0.12)+(500000*0.06)-(3200000-income)*0.24;
		}else if(income>3200000 && income<=3700000){
			return (500000*0.30)+(500000*0.24)+(500000*0.18)+(500000*0.12)+(500000*0.06)-(3200000-income)*0.30;
		}else{
			return (500000*0.06)+(500000*0.12)+(500000*0.18)+(500000*0.24)+(500000*0.30)+((income-3700000)*0.36);
		}
	}
	
	public static double getSaleTax(double value){
		return (value*0.025)+value;
	}
	
	public static double getSsclTax(double value){
		double saleTax=getSaleTax(value);
		double vat=saleTax*0.15;
		return (saleTax-value)+vat;
	}
	
	public static double getMonthlyInstallment(double lease,double annualRate,int year){
		double a=lease;
		double i=(annualRate/12.0)/100;
		int n=year*12;
		return a*i/(1-(1/Math.pow(1+i, n)));
	}
	
	public static double getLeasingAmount(double amount,double annualRate,int year){
		double pmt=amount;
		double i=(annualRate/12.0)/100;
		int n=year*12;
		return (double)Math.round(pmt*(1-Math.pow(1+i, -n))/i);
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
			
			System.out.print(" Enter an option to continue -> ");
			int option=scanner.nextInt();
		
			switch(option){
				case 1 :
					withHoldingTax();
					break;
				case 2 :
					payableTax();
					break;
				case 3 :
					incomeTax();
					break;
				case 4 :
					ssclTax();
					break;
				case 5 :
					leasingTax();
					break;
				case 6 :
					clearConsole();
					System.out.println("\n\tTHANK YOU FOR USING TAX CALCULATOR...");
					System.out.println("\n\t\tHAVE A NICE DAY...!!!");
					return;
				default :
					System.out.println("\n\tInvalid option...\n\n");
					System.out.print("Do you want to try again? (Press N to close the application) Y/N : ");
					String retry=scanner.next().toUpperCase();
					if(retry.equals("N")){
						clearConsole();
						System.out.println("\n\tTHANK YOU FOR USING TAX CALCULATOR...");
						System.out.println("\n\t\tHAVE A NICE DAY...!!!");
						break L1;
					}else{
						continue L1;
					}
			}
		}while(true);
		scanner.close();
	}
	
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
			
			System.out.print(" Enter an option to continue -> ");
			int option=scanner.nextInt();
		
			switch(option){
				case 1 :
					rentTax();
					break;
				case 2 :
					bankInterestTax();
					break;
				case 3 :
					dividendTax();
					break;
				case 4 :
					return;
				default :
					System.out.println("\n\tInvalid option...\n\n");
					System.out.print("Do you want to try again? (Press N to return to Main Menu) Y/N : ");
					String retry=scanner.next().toUpperCase();
					if(retry.equals("Y")){
						continue L1;
					}else{
						break L1;
					}
			}
		}while(true);
		scanner.close();
	}
	
	public static void leasingTax(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                         LEASING PAYMENT                         |");
			System.out.println("+-----------------------------------------------------------------+\n");
			
			System.out.println("\t[1] Calculate Monthly Installment\n");
			System.out.println("\t[2] Search Leasing Category\n");
			System.out.println("\t[3] Find Leasing Amount\n");
			System.out.println("\t[4] Exit\n\n");
			
			System.out.print(" Enter an option to continue -> ");
			int option=scanner.nextInt();
			
			switch(option){
				case 1 :
					monthlyInstallment();
					break;
				case 2 :
					searchLeasingCategory();
					break;
				case 3 :
					findLeasingAmount();
					break;
				case 4 :
					return;
				default :
					System.out.println("\n\tInvalid option...\n\n");
					System.out.print("Do you want to try again? (Press N to return to Main Menu) Y/N : ");
					String retry=scanner.next().toUpperCase();
					if(retry.equals("Y")){
						continue L1;
					}else{
						break L1;
					}
			}
		}while(true);
		scanner.close();
	}
	
	public static void rentTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+--------------------------------------------------+");
			System.out.println("|                     RENT TAX                     |");
			System.out.println("+--------------------------------------------------+\n");
			
			System.out.print(" Enter your rent           : ");
			double rent=scanner.nextDouble();
			
			if(rent<0) {
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(rent>0 && rent<=100000) {
				System.out.println("\n\tYou dont have to pay rent tax...\n\n\n");
			}else {
				System.out.printf("\n You have to pay rent tax  : %.2f\n\n\n",getRentTax(rent));
			}
			System.out.print("Do you want to calculate another Rent Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void bankInterestTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-----------------------------------------------------------+");
			System.out.println("|                     BANK INTEREST TAX                     |");
			System.out.println("+-----------------------------------------------------------+\n");
			
			System.out.print(" Enter your bank interest per year          : ");
			double interest=scanner.nextDouble();
			
			if(interest<0){
				System.out.println("\n\tInvalid input...\n\n\n");
			}else{
				System.out.printf("\n You have to pay Bank Interest Tax per year : %.2f\n\n\n",getBankInterestTax(interest));
			}
			
			System.out.print("Do you want to calculate another Bank Interest Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void dividendTax() {
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+------------------------------------------------------+");
			System.out.println("|                     DIVIDEND TAX                     |");
			System.out.println("+------------------------------------------------------+\n");
			
			System.out.print(" Enter your total dividend per year    : ");
			double dividend=scanner.nextDouble();
			
			if(dividend<0) {
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(dividend>0 && dividend<=100000) {
				System.out.println("\n\tYou dont have to pay Dividend Tax...\n\n\n");
			}else {
				System.out.printf("\n You have to pay Dividend Tax per year : %.2f\n\n\n",getDividendTax(dividend));
			}
			System.out.print("Do you want to calculate another Dividend Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void payableTax(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-----------------------------------------------------+");
			System.out.println("|                     PAYABLE TAX                     |");
			System.out.println("+-----------------------------------------------------+\n");
			
			System.out.print(" Enter your employee payment per month : ");
			double payment=scanner.nextDouble();
			
			if(payment<0){
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(payment<=100000){
				System.out.println("\n\tYou dont have to pay Payable Tax...\n\n\n");
			}else{
				System.out.printf("\n You have to pay Payable Tax per month : %.2f\n\n\n",(double)Math.round(getPayableTax(payment)));
			}
			
			System.out.print("Do you want to calculate another Payable Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void incomeTax(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+----------------------------------------------------+");
			System.out.println("|                     INCOME TAX                     |");
			System.out.println("+----------------------------------------------------+\n");
			
			System.out.print(" Enter your total income per year    : ");
			double income=scanner.nextDouble();
			
			if(income<0){
				System.out.println("\n\tInvalid input...\n\n\n");
			}else if(income<=1200000){
				System.out.println("\n\tYou dont have to pay Income Tax...\n\n\n");
			}else{
				System.out.printf("\n You have to pay Income Tax per year : %.2f\n\n\n",getIncomeTax(income));
			}
			
			System.out.print("Do you want to calculate another Income Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void ssclTax(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+--------------------------------------------------------------------+");
			System.out.println("|            SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX            |");
			System.out.println("+--------------------------------------------------------------------+\n");
			
			System.out.print(" Enter value of Good or Service : ");
			double value=scanner.nextDouble();
			
			if(value<0){
				System.out.println("\n\tInvalid input...\n\n\n");
			}else{
				System.out.printf("\n You have to pay SSCL Tax       : %.2f\n\n\n",getSsclTax(value));
			}
			
			System.out.print("Do you want to calculate another SSCL Tax (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void monthlyInstallment(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-------------------------------------------------------------------+");
			System.out.println("|                     CALCULATE LEASING PAYMENT                     |");
			System.out.println("+-------------------------------------------------------------------+\n");
			
			double lease;
			L2:do{
				System.out.print(" Enter lease amount         : ");
				lease=scanner.nextDouble();
				System.out.println();
				
				if(lease<0){
					System.out.println("\n\tInvalid number of lease amount... Enter the correct value again...\n\n");
					continue L2;
				}else{
					double annualRate;
					L3:do{
						System.out.print(" Enter annual interest rate : ");
						annualRate=scanner.nextDouble();
						System.out.println();
				
						if(annualRate<0){
							System.out.println("\n\tInvalid number of annual interest rate... Enter the correct value again...\n\n");
							continue L3;
						}else{
							int year;
							L4:do{
								System.out.print(" Enter number of year       : ");
								year=scanner.nextInt();
			
								if(year<0 || year>5){
									System.out.println("\n\tInvalid number of year... Enter the correct value again...\n\n");
									continue L4;
								}else{
									System.out.printf("\n Your monthly installment   : %.2f\n\n\n",getMonthlyInstallment(lease,annualRate,year));
									break L4;
								}
							}while(year!=0);
							break L3;
						}
					}while(annualRate!=0);
					break L2;
				}
			}while(lease!=0);
			
			System.out.print("\nDo you want to calculate another monthly installment (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void searchLeasingCategory(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-----------------------------------------------------------------+");
			System.out.println("|                     SEARCH LEASING CATEGORY                     |");
			System.out.println("+-----------------------------------------------------------------+\n");
			
			double lease;
			L2:do{
				System.out.print(" Enter lease amount         : ");
				lease=scanner.nextDouble();
				System.out.println();
				
				if(lease<0){
					System.out.println("\n\tInvalid number of lease amount... Enter the correct value again...\n\n");
					continue L2;
				}else{
					double annualRate;
					L3:do{
						System.out.print(" Enter annual interest rate : ");
						annualRate=scanner.nextDouble();
						System.out.println();
				
						if(annualRate<0){
							System.out.println("\n\tInvalid number of annual interest rate... Enter the correct value again...\n\n");
							continue L3;
						}else{
							System.out.printf("Your monthly installment for 3 year leasing plan - %.2f\n",getMonthlyInstallment(lease,annualRate,3));
							System.out.printf("Your monthly installment for 4 year leasing plan - %.2f\n",getMonthlyInstallment(lease,annualRate,4));
							System.out.printf("Your monthly installment for 5 year leasing plan - %.2f\n",getMonthlyInstallment(lease,annualRate,5));
							break L3;
						}
					}while(annualRate!=0);
					break L2;
				}
			}while(lease!=0);
			
			System.out.print("\nDo you want to calculate another Leasing Category (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
	}
	
	public static void findLeasingAmount(){
		Scanner scanner=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("+-------------------------------------------------------------+");
			System.out.println("|                     FIND LEASING AMOUNT                     |");
			System.out.println("+-------------------------------------------------------------+\n");
			
			double amount;
			L2:do{
				System.out.print(" Enter the monthly lease payment amount you can afford : ");
				amount=scanner.nextDouble();
				System.out.println();
				
				if(amount<0){
					System.out.println("\n\tInvalid number of lease amount... Enter the correct value again...\n\n");
					continue L2;
				}else{
					int year;
					L3:do{
						System.out.print(" Enter number of year                                  : ");
						year=scanner.nextInt();
						System.out.println();
	
						if(year<0 || year>5){
							System.out.println("\n\tInvalid number of year... Enter the correct value again...\n\n");
							continue L3;
						}else{
							double annualRate;
							L4:do{
								System.out.print(" Enter annual interest rate                            : ");
								annualRate=scanner.nextDouble();
								System.out.println();
						
								if(annualRate<0){
									System.out.println("\n\tInvalid number of annual interest rate... Enter the correct value again...\n\n");
									continue L4;
								}else{
									System.out.printf(" You can get Lease Amount                              : "
														+"%.2f\n\n\n",getLeasingAmount(amount,annualRate,year));
									break L4;
								}
							}while(annualRate!=0);
							break L3;
						}
					}while(year!=0);
					break L2;
				}
			}while(amount!=0);
			
			System.out.print("\nDo you want to calculate another Leasing Category (Y/N) : ");
			String retry=scanner.next().toUpperCase();
			if(retry.equals("Y")){
				continue L1;
			}else{
				break L1;
			}
		}while(true);
		scanner.close();
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
