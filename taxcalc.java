import java.util.*;
 class taxcalc{
	 
	public  static void taxMenu(){
		Scanner input=new Scanner(System.in);
		
		L1:do{
			clearConsole();
			System.out.println("				 __  _______  _________ _______");
			System.out.println("				|  \\/       \\|         |       \\");
			System.out.println("				 \\$|   $$$$$$| $$$$$$$$\\$$$$$$$$");
			System.out.println("				|  | $$  \\$$ | $$__      | $$");
			System.out.println("				| $| $$      | $$  \\     | $$");
			System.out.println("				| $| $$   __ | $$$$$     | $$");
			System.out.println("				| $| $$__/   | $$_____   | $$");
			System.out.println("				| $$\\$$     $| $$     \\  | $$");
			System.out.println("				 \\$$ \\$$$$$$  \\$$$$$$$$$  \\$$");
			System.out.println();
			System.out.println();
			System.out.println(" _____             __    __    ______              _          ______   _    _   _                 _____    ____    _____");
			System.out.println("|_   _|     /\\     \\ \\  / /   / _____|     /\\     | |        / _____| | |  | | | |         /\\    |_   _|  / __ \\  |  __ \\");
			System.out.println("  | |      /  \\     \\ \\/ /   | |          /  \\    | |       | |       | |  | | | |        /  \\     | |   | |  | | | |__) |");
			System.out.println("  | |     / /\\ \\     >  <    | |         / /\\ \\   | |       | |       | |  | | | |       / /\\ \\    | |   | |  | | |  _   /");
			System.out.println("  | |    / ____ \\   / /\\ \\   | |_____   / ____ \\  | |_____  | |_____  | |__| | | |___   / ____ \\   | |   | |__| | | | \\ \\");
			System.out.println("  |_|   /_/    \\_\\ /_/  \\_\\   \\______| /_/    \\_\\ |_______|  \\______|  \\____/  |_____| /_/    \\_\\  |_|    \\____/  |_|  \\_\\");
			System.out.println();
			System.out.println();
			System.out.println("==========================================================================================================================");
			System.out.println("");
			System.out.println("[1]Withholding tax");
			System.out.println("[2]Payable tax");
			System.out.println("[3]Income tax");
			System.out.println("[4]Social security Contribution Levy(SSCL) tax");
			System.out.println("[5]Leasing payment");
			System.out.println("[6]Exit");
			System.out.println("");
			
			System.out.print("Enter an option to continue -> ");
			int op=input.nextInt();
			
			if(op==1){
				withholdingTax();
			}else if(op==2){
				payableTax();
			}else if(op==3){
				incomeTax();
			}else if(op==4){
				SSCL();
			}else if(op==5){
				leasingPayment();
			}else if(op==6){
				exit();
			}else{
				System.out.println("Wrong Option...,Try Again...");
				continue L1;
			}
		}while(true);
	}
		
	
	public static void main(String args[]){
		taxMenu();
	}
	
	public static void withholdingTax(){
		Scanner input=new Scanner(System.in);
		
		L1:do{
			clearConsole();
			System.out.println("----------------------------------------------------");
			System.out.println("                WITHHOLDING TAX                     ");
			System.out.println("----------------------------------------------------");
			System.out.println();
			System.out.println("[1]Rent Tax ");
			System.out.println("[2]Bank Interest Tax ");
			System.out.println("[3]Divident Tax ");
			System.out.println("[4]Exit ");
			System.out.println("");
			
			System.out.print("Enter an option to continue >");
			int op1 = input.nextInt();
			if(op1==1){
				L2:do{
					clearConsole();
					System.out.println("----------------------------------------------------");
					System.out.println("                      Rent Tax                      ");
					System.out.println("----------------------------------------------------");
					System.out.println();
					System.out.print("Enter Your Rent > ");
					int rent=input.nextInt();
					
					double payRent=(double)rent*0.05;
					if(0<rent && rent<=50000){
						System.out.println();
						System.out.println("You Don't have to pay rent tax...");
						System.out.println();
						System.out.println("Do you want to calculate another rent tax (Y/N) ");
						char ch=input.next().charAt(0);
							if(ch=='Y' || ch=='y'){
								continue L2;
							}else if(ch=='N' || ch=='n'){
								taxMenu();
							}else{
								System.out.println("Wrong selection, try again....");
								continue L1;
							}
							
					}else if(rent<0){
						System.out.println();
						System.out.println("Invalid input... ");
						System.out.println("");
						System.out.print("Do You want to Calculate Another rent tax (Y/N) : ");
						char ch=input.next().charAt(0);
							if(ch=='Y' || ch=='y'){
								continue L2;
							}else if(ch=='N' || ch=='n'){
								taxMenu();
							}else{
								System.out.println("Wrong selection, try again....");
								continue L1;
							}
					}else{
						System.out.println();
						System.out.println("You have to pay rent tax : "+payRent);
						System.out.println();
						System.out.print("Do You want to Calculate Another rent tax (Y/N) : ");
						char ch=input.next().charAt(0);
							if(ch=='Y' || ch=='y'){
								continue L2;
							}else if(ch=='N' || ch=='n'){
								taxMenu();
							}else{
								System.out.println("Wrong selection, try again....");
								continue L1;
							}
					}		
				}while(true);
			}
			
			if(op1==2){
				L2:do{
				clearConsole();
				System.out.println("----------------------------------------------------");
				System.out.println("                     Bank Interest Tax              ");
				System.out.println("----------------------------------------------------");
				System.out.println("");
				
				System.out.print("Enter your bank intrest per year : ");
				int bankIntrest=input.nextInt();
				
				double bankIntrestTax=(double)bankIntrest*0.05;
				
				System.out.println();
				System.out.println("You Have to pay bank intrest tax per year : "+bankIntrestTax);
				System.out.println();
					System.out.print("Do You want to Calculate Another bank intrest tax (Y/N) : ");
					char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L2;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
				}while(true);
			}
			
			if(op1==3){
				L2:do{
				clearConsole();
				System.out.println("-----------------------------------------------");
				System.out.println("                     Dividend Tax              ");
				System.out.println("-----------------------------------------------");
				System.out.println();
				
				System.out.print("Enter your total dividend per year : ");
				int div=input.nextInt();
				int ab=100000;
				double divTax=((double)div-ab)*0.14;
					
					if(div>=100000){
					System.out.println();
					System.out.println("You have to pay dividend tax per year : "+(divTax));
					System.out.println();
						System.out.print("Do You want to Calculate Another dividend tax (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L2;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
					}else{
					System.out.println();
					System.out.println("you dont have to pay dividend tax...");
					System.out.println();
						System.out.print("Do You want to Calculate Another dividend tax (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L2;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
					}
				
				}while(true);
			}
			
			if(op1==4){
				break L1;
			}
			
		}while(true);
	}
	
	public static void payableTax(){
		Scanner input=new Scanner(System.in);
		
		L1:do{
			clearConsole();
			System.out.println("----------------------------");
			System.out.println("        PAYABLE TAX         ");
			System.out.println("----------------------------");
			System.out.println();
			
			System.out.print("Enter your employee payment per month : ");
			double payTax=input.nextInt();
			
			double tax=0;
			tax=payTax;
				if(payTax<=100000){
				tax=0;
				}else if(payTax<=141667){
					tax=(payTax-100000)*0.06;
				}else if(payTax<=183333){
					tax=2500+(payTax-141667)*0.12;
				}else if(payTax<=225000){
					tax=7500+(payTax-183333)*0.18;
				}else if(payTax<=266667){
					tax=15000+(payTax-225000)*0.24;
				}else if(payTax<=308333){
					tax=25000+(payTax-266667)*0.30;
				}else if(payTax<=350000){
					tax=37500+(payTax-308333)*0.36;
				}
			System.out.println();
					
				if(payTax<100000){
					System.out.println("");
					System.out.println("You Don't have to pay Payable Tax...");
				}else{
					System.out.println("");
					System.out.println("You have to pay Income Tax per month: " +(Math.round(tax)));
				}
				System.out.print("Do You want to Calculate Another Payable tax (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L1;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
			
		}while(true);
	}
	
	public static void incomeTax(){
		Scanner input=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("----------------------------");
			System.out.println("        INCOME TAX         ");
			System.out.println("----------------------------");
			System.out.println();
			
			System.out.print("Enter your employee payment per month : ");
			double incomeTax=input.nextInt();
			
			double tax=0;
			tax=incomeTax;
				if(incomeTax<=1200000){
				tax=0;
				}else if(incomeTax<=1700000){
					tax=(incomeTax-1200000)*0.06;
				}else if(incomeTax<=2200000){
					tax=30000+(incomeTax-1700000)*0.12;
				}else if(incomeTax<=2700000){
					tax=90000+(incomeTax-2200000)*0.18;
				}else if(incomeTax<=3200000){
					tax=180000+(incomeTax-2700000)*0.24;
				}else if(incomeTax<=3700000){
					tax=300000+(incomeTax-320000)*0.30;
				}else if(incomeTax>3700000){
					tax=450000+(incomeTax-3700000)*0.36;
				}
			System.out.println();
					
				if(incomeTax<1200000){
					System.out.println("");
					System.out.println("You Don't have to pay Income Tax...");
				}else{
					System.out.println("");
					System.out.println("You have to pay Income Tax per month: " +(Math.round(tax)));
				}
				System.out.print("Do You want to Calculate Another Income tax (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L1;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
			
		}while(true);
	}
	
	public static void SSCL(){
		Scanner input=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("-------------------------------------------------------------");
			System.out.println("        SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX         ");
			System.out.println("-------------------------------------------------------------");
			System.out.println();
			
			System.out.print("Enter value of Good or Service : ");
			double value=input.nextInt();
			double tValue=0;
			
			double saleTax=value*0.025;
			tValue=value+saleTax;
			
			double VAT=tValue*0.15;
			double SSCL=saleTax+VAT;
			System.out.println("You Have to pay SSCL tax : "+SSCL);
			System.out.println();
			System.out.print("Do You want to Calculate Another Income tax (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L1;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L1;
						}
			
			
		}while(true);
	}
	
	public static void leasingPayment(){
		Scanner input=new Scanner(System.in);
		L1:do{
			clearConsole();
			System.out.println("--------------------------------");
			System.out.println("        LEASING PAYMENTS        ");
			System.out.println("--------------------------------");
			System.out.println();
			
			System.out.println("\t[1] Calculate Monthly Installment ");
			System.out.println("\t[2] Search Leasing Category");
			System.out.println("\t[3] Find Leasing Amount");
			System.out.println("\t[4] Exit");
			System.out.println();
			
			System.out.print("Enter an option to continue -> ");
			int op2=input.nextInt();
			
			if(op2==1){
				L2:do{
					clearConsole();
					System.out.println("------------------------------------------");
					System.out.println("        Calculate Leasing Payment         ");
					System.out.println("------------------------------------------");
					System.out.println();
					System.out.print("Enter Lease Amount : ");
					double amount=input.nextDouble();
					
					System.out.print("Enter Annual intrest rate : ");
					double rate=input.nextDouble()/100.0;
					
					L3:do{
						System.out.print("Enter number of year");
						int year=input.nextInt();
					
						if(year>=5){
							System.out.println(" \tInvalid number of year...Enter the correct value again...");
							continue L3;
						}else{
							double mRate=rate/12;
							int Months=year*12;
				
							double monthlyI=(amount*mRate)/(1-(1/Math.pow(1+mRate,Months)));
							System.out.println("Your Monthly Installment : "+(float)(monthlyI));	
							
							System.out.print("Do You want to Calculate monthly installment (Y/N) : ");
							char ch=input.next().charAt(0);
							if(ch=='Y' || ch=='y'){
								continue L2;
							}else if(ch=='N' || ch=='n'){
								taxMenu();
							}else{
								System.out.println("Wrong selection, try again....");
								continue L3;
							}
						}
					
					
					
					}while(true);
				}while(true);
			}
			
			if(op2==2){
				L2:do{
					clearConsole();
					System.out.println("------------------------------------------");
					System.out.println("        Calculate Leasing Payment         ");
					System.out.println("------------------------------------------");
					System.out.println();
					System.out.print("Enter Lease Amount : ");
					double amount1=input.nextDouble();
					
					System.out.print("Enter Annual intrest rate : ");
					double rate1=input.nextDouble()/100.0;
					
					double mRate1=rate1/12;
						
					//for 3 years	
						double monthlyIn3=(amount1*mRate1)/(1-(1/Math.pow(1+mRate1,36)));
						System.out.println("Your Monthly Installment for year leasing plan : "+(float)(monthlyIn3));
						
					//for 4 years	
						double monthlyIn4=(amount1*mRate1)/(1-(1/Math.pow(1+mRate1,48)));
						System.out.println("Your Monthly Installment for year leasing plan : "+(float)(monthlyIn4));
						
					//for 3 years	
						double monthlyIn5=(amount1*mRate1)/(1-(1/Math.pow(1+mRate1,60)));
						System.out.println("Your Monthly Installment for year leasing plan : "+(float)(monthlyIn5));
						
							System.out.print("Do You want to Calculate monthly installment (Y/N) : ");
							char ch=input.next().charAt(0);
							if(ch=='Y' || ch=='y'){
								continue L2;
							}else if(ch=='N' || ch=='n'){
								taxMenu();
							}else{
								System.out.println("Wrong selection, try again....");
								continue L2;
							}		
				}while(true);
			}
			
			if(op2==3){
				L2:do{
					clearConsole();
					System.out.println("------------------------------------------");
					System.out.println("           Find Leasing Amount            ");
					System.out.println("------------------------------------------");
					System.out.println();
					System.out.print("Enter the monthly lease payment amaount you can afford : ");
					int amount=input.nextInt();
					System.out.print("Enter number of year : ");
					int year=input.nextInt();
					int Months=year*12;
					
					System.out.print("Enter Annual intrest rate : ");
					double rate=input.nextDouble()/100.00;
					double mRate=rate/12;
					
					if(year>6 || rate>0){
					double lamount=amount*(1-(1/Math.pow(1+mRate,Months)))/mRate;
					System.out.print("You Can get lease Amount : "+(float)lamount);
					System.out.println();
					
						System.out.print("Do You want to Calculate monthly installment (Y/N) : ");
						char ch=input.next().charAt(0);
						if(ch=='Y' || ch=='y'){
							continue L2;
						}else if(ch=='N' || ch=='n'){
							taxMenu();
						}else{
							System.out.println("Wrong selection, try again....");
							continue L2;
						}
					}
				
				}while(true);
			}
			
			if(op2==4){
				break L1;
			}	
		}while(true);
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
				//Handle any exceptions.
			}	
		}
		
	public static void exit(){ 
		System.out.println(); 
		System.exit(0); 
	} 	
}	

