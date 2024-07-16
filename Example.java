import java.util.*;
class Example{
	   public static void main(String args[]){
	   Scanner input=new Scanner(System.in);
	   
	   String bankSystemLogo = "         ____       " +
	   "       _       _____" +
	   "           _        " +
	   "         \r\n" +
	   "        |  _ \\     " +
	   "       | |     / ___" +
	   "_|         | |      " +
	   "          \r\n" +
	   "        | |_) | __ _" +
	   " _ __ | | __ | (___ " +
	   " _   _ ___| |_ ___ _" +
	   " __ ___  \r\n" +
	   "        |  _ < / _` " +
	   "| \'_ \\| |/ /  \\__" +
	   "_ \\| | | / __| __/ " +
	   "_ \\ \'_ ` _ \\ \r\n" +
	   "        | |_) | (_| " +
	   "| | | |   <   ____) " +
	   "| |_| \\__ \\ ||  __" +
	   "/ | | | | |\r\n" +
	   "        |____/ \\__," +
	   "_|_| |_|_|\\_\\ |___" +
	   "__/ \\__, |___/\\__" +
	   "\\___|_| |_| |_|\r\n" +
	   "                    " +
	   "                    " +
	   "  __/ |             " +
	   "         \r\n" +
	   "                    " +
	   "                    " +
	   " |___/              " +
	   "         ";
	   
	   System.out.println(bankSystemLogo);
	   System.out.println("\t=============================================================");
	   
	   System.out.print("\n\n");
	   
	   System.out.print("\t\t[1] Deposit");
	   System.out.print("\t\t[2] Loans");
	   System.out.print("\n\n\t\t[3] Tax");
	   System.out.print("\t\t\t[4] Share market");
	   System.out.print("\n\n\t\t[5] Exit");
	   
	   
	   System.out.print("\n\n");
	   
	    
	   System.out.print("Enter an option to continue -> ");
	   int option1=input.nextInt();
	   System.out.print("\n\n\n");
	   
		   
	   if(option1==1){  
		   String depositLogo = "              _____ " +
		   "                    " +
		   "  _ _   \r\n" +
		   "             |  __ " +
		   "\\                  " +
		   "   (_) |  \r\n" +
		   "             | |  | " +
		   "| ___ _ __   ___  __" +
		   "_ _| |_ \r\n" +
		   "             | |  | " +
		   "|/ _ \\ \'_ \\ / _ " +
		   "\\/ __| | __|\r\n" +
		   "             | |__| " +
		   "|  __/ |_) | (_) \\_" +
		   "_ \\ | |_ \r\n" +
		   "             |_____/" +
		   " \\___| .__/ \\___/|" +
		   "___/_|\\__|\r\n" +
		   "                    " +
		   "     | |            " +
		   "        \r\n" +
		   "                    " +
		   "     |_|            " +
		   "        ";
		   System.out.println(depositLogo);
		   System.out.println("\t==============================================");
		   
		   System.out.print("\n\n");
		   
		   System.out.println("\t\t[1] Saving account");  
		   System.out.println("\n\t\t[2] Fixed deposit");
		   
		   System.out.print("\n\nEnter an option to continue -> ");
		   int option2=input.nextInt();
		   System.out.print("\n\n\n");
		  
		   switch(option2){		   
		          case 1:String savingAccountLogo = "              _____ " +
				  "            _       " +
				  "                    " +
				  "                    " +
				  "      _   \r\n" +
				  "             / ____|" +
				  "           (_)      " +
				  "               /\\  " +
				  "                    " +
				  "      | |  \r\n" +
				  "            | (___  " +
				  " __ ___   ___ _ __  " +
				  " __ _ ___     /  \\ " +
				  "  ___ ___ ___  _   _" +
				  " _ __ | |_ \r\n" +
				  "             \\___ " +
				  "\\ / _` \\ \\ / / | " +
				  "\'_ \\ / _` / __|   " +
				  "/ /\\ \\ / __/ __/ _" +
				  " \\| | | | \'_ \\| _" +
				  "_|\r\n" +
				  "             ____) |" +
				  " (_| |\\ V /| | | | " +
				  "| (_| \\__ \\  / ___" +
				  "_ \\ (_| (_| (_) | |" +
				  "_| | | | | |_ \r\n" +
				  "            |_____/ " +
				  "\\__,_| \\_/ |_|_| |" +
				  "_|\\__, |___/ /_/   " +
				  " \\_\\___\\___\\___/" +
				  " \\__,_|_| |_|\\__|" +
				  "\r\n" +
				  "                    " +
				  "                    " +
				  " __/ |              " +
				  "                    " +
				  "          \r" +
				  "                    " +
				  "                    " +
				  "|___/               " +
				  "                    " +
				  "          ";
						   
				  System.out.println(savingAccountLogo);
				  System.out.println("\t======================================================================================");
						   
				  System.out.print("\n\n");
						   
				  System.out.print("\t\tEnter your Amount : "); 
				  int amount=input.nextInt();
						   
				  System.out.print("\n\n");
						   
				  double gpm=amount*5/100;
				  System.out.printf("\t\t%s%.2f","The interest you get per month : ",+gpm);
						   
				  System.out.print("\n");
					   
				  double gpy=(double)amount*5/100*12;
				  System.out.printf("\t\t%s%.2f","The interest you get per year : ",+gpy);
				  break;
			       
			      
				  case 2:String fixedDepositLogo = "             ______ " +
			      "_              _    " +
				  "   _                " +
				  "      _ _   \r\n" +
				  "            |  ____(" +
				  "_)            | |   " +
				  "  | |               " +
				  "     (_) |  \r\n" +
			      "            | |__   " +
				  "___  _____  __| |   " +
				  "__| | ___ _ __   ___" +
				  "  ___ _| |_ \r\n" +
				  "            |  __| |" +
				  " \\ \\/ / _ \\/ _` |" +
				  "  / _` |/ _ \\ \'_ " +
				  "\\ / _ \\/ __| | __|" +
				  "\r\n" +
				  "            | |    |" +
				  " |>  <  __/ (_| | | " +
				  "(_| |  __/ |_) | (_)" +
				  " \\__ \\ | |_ \r\n" +
			      "            |_|    |" +
				  "_/_/\\_\\___|\\__,_|" +
				  "  \\__,_|\\___| .__/" +
				  " \\___/|___/_|\\__|" +
			      "\r\n" +
				  "                    " +
				  "                    " +
				  "         | |        " +
				  "            \r" +
				  "                    " +
				  "                    " +
				  "         |_|        " +
				  "            ";
				  System.out.println(fixedDepositLogo);
				  System.out.println("\t======================================================================================");			  
					   
				  System.out.print("\n\n");
							   
				  System.out.print("\t\tYour Amount : "); 
				  int amount2=input.nextInt();
							   
				  System.out.print("\n");
					  
				  System.out.print("\t\tEnter number of year : "); 
				  int num=input.nextInt();
					  
				  System.out.print("\n\n\n");
					  
				  double pm=(double)amount2*8/100;
				  System.out.printf("\t\t%s,%.2f","Interest you get per month : ",+pm); 
					  
				  System.out.print("\n\n");
					  
				  double total=(double)num*pm*12+amount2;
				  System.out.printf("\t\t%s,%.2f","Total amount at the end : ",+total);
				  }
		}else if(option1==2){
			String loanLogo = "              _     " +
			"                   " +
			"\r\n" +
			"             | |    " +
			"                   " +
			"\r\n" +
			"             | |    " +
			" ___   __ _ _ __   " +
			"\r\n" +
			"             | |    " +
			"/ _ \\ / _` | \'_ \\" +
			"  \r\n" +
			"             | |___|" +
			" (_) | (_| | | | | " +
			"\r\n" +
		    "             |______" +
			"\\___/ \\__,_|_| |_|" +
			" \r\n" +
		    "                    " +
			"                   " +
		    "\r" +
			"                    " +
			"                   ";
			System.out.println(loanLogo);
			System.out.println("\t===================================");
	   
		    System.out.println("\n\n\t\t[1] Personal Loan");
		    System.out.println("\n\t\t[2] Business Loan");
		    System.out.println("\n\t\t[3] Home equity Loan");
		    System.out.println("\n\t\t[4] Car finance");
			
		    System.out.print("\n\nEnter an option to continue -> ");
		    int option3=input.nextInt();
		    System.out.print("\n\n\n");
			
			switch(option3){
			   case 1:String personalLoanLogo = "              _____ " +
			   "                    " +
			   "           _   _    " +
			   "                    " +
			   "\r\n" +
			   "             |  __ " +
			   "\\                  " +
			   "            | | | | " +
			   "                    " +
			   "  \r\n" +
			   "             | |__) " +
			   "|__ _ __ ___  ___  _" +
			   " __   __ _| | | |   " +
			   "  ___   __ _ _ __   " +
			   "\r\n" +
			   "             |  ___/" +
			   " _ \\ \'__/ __|/ _ " +
			   "\\| \'_ \\ / _` | | " +
			   "| |    / _ \\ / _` |" +
			   " \'_ \\  \r\n" +
			   "             | |  | " +
			   " __/ |  \\__ \\ (_) " +
			   "| | | | (_| | | | |_" +
			   "__| (_) | (_| | | | " +
			   "| \r\n" +
			   "             |_|   " +
			   "\\___|_|  |___/\\___" +
			   "/|_| |_|\\__,_|_| |_" +
			   "_____\\___/ \\__,_|_" +
			   "| |_| \r\n" +
			   "                    " +
			   "                    " +
			   "                    " +
			   "                    " +
			   "\r\n" +
			   "                    " +
			   "                    " +
			   "                    " +
			   "                    ";
			   System.out.println(personalLoanLogo);
			   System.out.println("\t=================================================================================");
					   
			   System.out.print("\n\n");
			   
			   System.out.print("\t\tEnter your Salary    : ");
			   int salary=input.nextInt();
			   
			   if(salary>=50000){
				  double withdraw=(double)salary*5;
				  System.out.printf("\n\n\n\t\t%s%.2f","The maximum amount you can withdraw is ",+withdraw);
				 
				  System.out.print("\n\n\n\t\tEnter your Amount : ");
				  int amount=input.nextInt();
				 
				  System.out.print("\n\n\t\tEnter number of Month : ");
				  int month=input.nextInt();
				  
				  System.out.print("\n\n");
				  
				  
				  int year;
				  year=month/12;
				  int remainingmonth=month%12;
				 
				     if(amount>200000 & year>2){
					     double monthlyinstalment1=amount*0.15+amount;
					     System.out.printf("\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment1/month);
			         }else{
						 double monthlyinstalment2=amount*0.10+amount;
						 System.out.printf("\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment2/month);
					  }
						 
				}else{
				  System.out.print("\n\n\t\t\tYou cannot get a loan....");
				}
				System.out.print("\n\n\n"); 
				break;
				
			    
				
				case 2:String businessLoanLogo = "             ____   " +
				   "         _          " +
				   "             _      " +
				   "                 \r" +
				   "\n" +
				   "            |  _ \\ " +
				   "         (_)        " +
				   "             | |    " +
				   "                  \r" +
				   "\n" +
				   "            | |_) |_" +
				   "   _ ___ _ _ __   __" +
				   "_  ___ ___  | |     " +
				   "___   __ _ _ __  \r" +
				   "\n" +
				   "            |  _ <| " +
				   "| | / __| | \'_ \\ /" +
				   " _ \\/ __/ __| | |  " +
				   "  / _ \\ / _` | \'_ " +
				   "\\ \r\n" +
				   "            | |_) | " +
				   "|_| \\__ \\ | | | | " +
				   " __/\\__ \\__ \\ | |" +
				   "___| (_) | (_| | | |" +
				   " |\r\n" +
				   "            |____/ " +
				   "\\__,_|___/_|_| |_|" +
				   "\\___||___/___/ |___" +
				   "___\\___/ \\__,_|_| " +
				   "|_|\r\n" +
				   "                    " +
				   "                    " +
				   "                    " +
				   "                 \r" +
				   " " +
				   "                    " +
				   "                    " +
				   "                    " +
				   "                 ";
				System.out.println(businessLoanLogo);
			    System.out.println("\t=================================================================================");
			   
			    System.out.print("\n\n\t\tEnter your Income    : ");
			    int income=input.nextInt();
				
				if(income>=50000){
				  double withdraw=(double)income*5;
				  System.out.printf("\n\n\n\t\t%s%.2f","The maximum amount you can withdraw is ",+withdraw);
				  
				  System.out.print("\n\n\n\t\tEnter your Amount : ");
				  int amount=input.nextInt();
				 
				  System.out.print("\n\n\t\tEnter number of Month : ");
				  int month=input.nextInt();
				  
				  int year;
				  year=month/12;
				  int remainingmonth=month%12;
				  
				     if(amount>500000 & year>3){
					     double monthlyinstalment1=amount*0.20+amount;
					     System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment1/month);
			         }else{
						 double monthlyinstalment2=amount*0.15+amount;
						 System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment2/month);
					  }
				}else{
					System.out.print("\n\n\t\t\tYou cannot get a loan....");
				}
				System.out.print("\n\n\n"); 
				break;
				
				
				case 3:String homeEquityLoanLogo = "             _    _ " +
				   "                    " +
				   "                    " +
				   "_ _           _     " +
				   "                  \r" +
				   "\n" +
				   "            | |  | |" +
				   "                    " +
				   "                   (" +
				   "_) |         | |    " +
				   "                  \r" +
				   "\n" +
				   "            | |__| |" +
				   " ___  _ __ ___   ___" +
				   "    ___  __ _ _   _ " +
				   "_| |_ _   _  | |    " +
				   " ___   __ _ _ __  \r" +
				   "\n" +
				   "            |  __  |" +
				   "/ _ \\| \'_ ` _ \\ /" +
				   " _ \\  / _ \\/ _` | " +
				   "| | | | __| | | | | " +
				   "|    / _ \\ / _` | " +
				   "\'_ \\ \r\n" +
				   "            | |  | |" +
				   " (_) | | | | | |  __" +
				   "/ |  __/ (_| | |_| |" +
				   " | |_| |_| | | |___|" +
				   " (_) | (_| | | | |\r" +
				   "\n" +
				   "            |_|  |_|" +
				   "\\___/|_| |_| |_|\\_" +
				   "__|  \\___|\\__, |\\" +
				   "__,_|_|\\__|\\__, | " +
				   "|______\\___/ \\__,_" +
				   "|_| |_|\r\n" +
				   "                    " +
				   "                    " +
				   "           | |      " +
				   "       __/ |        " +
				   "                  \r" +
				   " " +
				   "                    " +
				   "                    " +
				   "           |_|      " +
				   "      |___/         " +
				   "                  ";
				System.out.println(homeEquityLoanLogo);
			    System.out.println("\t=================================================================================");
			   
			    System.out.print("\n\n\t\tEnter your Salary    : ");
			    int ysalary=input.nextInt();
			    
			    if(ysalary>=50000){
				  double withdraw=(double)ysalary*5;
				  System.out.printf("\n\n\n\t\t%s%.2f","The maximum amount you can withdraw is ",+withdraw);
				  
				  System.out.print("\n\n\n\t\tEnter your Amount : ");
				  int amount=input.nextInt();
				 
				  System.out.print("\n\n\t\tEnter number of Month : ");
				  int month=input.nextInt();
			    
				  int year;
				  year=month/12;
				  int remainingmonth=month%12;
				    
				     if(amount>500000 & year>4){
					     double monthlyinstalment1=amount*0.08+amount;
					     System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment1/month);
			         }else{
						 double monthlyinstalment2=amount*0.06+amount;
						 System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment  : ",+monthlyinstalment2/month);
					 }
			    }else{
				   System.out.print("\n\n\t\t\tYou cannot get a loan....");
				}
				System.out.print("\n\n\n"); 
				break;
				
				case 4:String financeLoanLogo = "             ______ " +
				   "_                   " +
				   "           _        " +
				   "               \r\n" +
				   "            |  ____(" +
				   "_)                  " +
				   "          | |       " +
				   "               \r\n" +
				   "            | |__   " +
				   "_ _ __   __ _ _ __  " +
				   " ___ ___  | |     __" +
				   "_   __ _ _ __  \r\n" +
				   "            |  __| |" +
				   " | \'_ \\ / _` | \'_" +
				   " \\ / __/ _ \\ | |  " +
				   "  / _ \\ / _` | \'_ " +
				   "\\ \r\n" +
				   "            | |    |" +
				   " | | | | (_| | | | |" +
				   " (_|  __/ | |___| (_" +
				   ") | (_| | | | |\r\n" +
				   "            |_|    |" +
				   "_|_| |_|\\__,_|_| |_" +
				   "|\\___\\___| |______" +
				   "\\___/ \\__,_|_| |_|" +
				   "\r\n" +
				   "                    " +
				   "                    " +
				   "                    " +
				   "               \r\n" +
				   "                    " +
				   "                    " +
				   "                    " +
				   "               ";
				System.out.println(financeLoanLogo);
			    System.out.println("\t=================================================================================");
			   
			    System.out.print("\n\n\t\tEnter value of the vehicle    : ");
			    int value=input.nextInt();
			     
				System.out.print("\n\n\t\tEnter number of Month         : ");
			    int month=input.nextInt();
			    
			    
				    
				     if(month<12){
					     double monthlyinstalment1=value*0.06+value;
					     System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment       : ",+monthlyinstalment1/month);
			         }else if(month>12 & month<24){
						 double monthlyinstalment2=value*0.10+value;
						 System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment       : ",+monthlyinstalment2/month);
					 }else if(month>24 & month<36){
						 double monthlyinstalment3=value*0.14+value;
						 System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment       : ",+monthlyinstalment3/month);
				     }else{
						 double monthlyinstalment4=value*0.16+value;
						 System.out.printf("\n\n\t\t%s%.2f","Your Monthly Instalment       : ",+monthlyinstalment4/month);
				     }
						 
			}		
	    }else if(option1==3){
			String taxLogo = "             _______" +
		   "         \r\n" +
		   "            |__   __" +
		   "|        \r\n" +
		   "               | | _" +
		   "_ ___  __\r\n" +
		   "               | |/ " +
		   "_` \\ \\/ /\r\n" +
		   "               | | (" +
		   "_| |>  < \r\n" +
		   "               |_|\\" +
		   "__,_/_/\\_\\\r\n" +
		   "                    " +
		   "         \r" +
		   "                    " +
		   "         ";
		   System.out.println(taxLogo);
		   System.out.println("\t========================================================");
		   
		   System.out.println("\n\n\t\t[1] Rent Tx");
		   System.out.println("\n\t\t[2] Income Tax");
		   System.out.println("\n\t\t[3] Payble Tax");
		   System.out.println("\n\t\t[4] Leasing");
			
		   System.out.print("\n\nEnter an option to continue -> ");
		   int option4=input.nextInt();
		   System.out.print("\n\n\n");
		   
		   switch (option4){
			   case 1:String rentTaxLogo = "             _____  " +
			   "          _     ____" +
			   "___         \r\n" +
			   "            |  __ \\" +
			   "          | |   |__ " +
			   "  __|        \r\n" +
			   "            | |__) |" +
			   "___ _ __ | |_     | " +
			   "| __ ___  __\r\n" +
			   "            |  _  //" +
			   " _ \\ \'_ \\| __|   " +
			   " | |/ _` \\ \\/ /\r" +
			   "\n" +
			   "            | | \\ " +
			   "\\  __/ | | | |_    " +
			   " | | (_| |>  < \r\n" +
			   "            |_|  \\_" +
			   "\\___|_| |_|\\__|   " +
			   " |_|\\__,_/_/\\_\\\r" +
			   "\n" +
			   "                    " +
			   "                    " +
			   "            \r" +
			   "                    " +
			   "                    " +
			   "            ";
			   System.out.println(rentTaxLogo);
			   System.out.println("\t========================================================");
			   
			   System.out.print("\n\n\tEnter your Rent    : ");
			   int rent=input.nextInt();
			   
			   double renttax=(double)rent;
			   if(rent<100000){
				   System.out.print("\n\n\t\tYou are not required to pay rent tax..");
				   
			   }else{
				   System.out.printf("\n\n\t%s%.2f","You have to pay Rent Tax   : ",+renttax/100*5);
			   }
			   System.out.print("\n\n\n\n\n"); 
			   break;
			   
	            
	           case 2:String incomeTaxLogo = "             _____  " +
			   "                    " +
			   "            _______ " +
			   "        \r\n" +
			   "            |_   _| " +
			   "                    " +
			   "           |__   __|" +
			   "        \r\n" +
			   "              | |  _" +
			   " __   ___ ___  _ __ " +
			   "___   ___     | | __" +
			   " ___  __\r\n" +
			   "              | | | " +
			   "\'_ \\ / __/ _ \\| " +
			   "\'_ ` _ \\ / _ \\   " +
			   " | |/ _` \\ \\/ /\r" +
			   "\n" +
			   "             _| |_| " +
			   "| | | (_| (_) | | | " +
			   "| | |  __/    | | (_" +
			   "| |>  < \r\n" +
			   "            |_____|_" +
			   "| |_|\\___\\___/|_| " +
			   "|_| |_|\\___|    |_|" +
			   "\\__,_/_/\\_\\\r\n" +
			   "                    " +
			   "                    " +
			   "                    " +
			   "        \r" +
			   "                    " +
			   "                    " +
			   "                    " +
			   "        ";
			   System.out.println(incomeTaxLogo);
			   System.out.println("\t====================================================================");
			   
			   System.out.print("\n\n\tEnter your total income per year    : ");
			   int totalincome=input.nextInt();
			   
			   if(totalincome>1200000){
				   if(totalincome<=1700000){
					   double ti1=(totalincome-1200000)*0.06;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti1);
					
				   }else if(totalincome<=2200000){
					   double ti2=(totalincome-1200000)*0.12;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti2);
				   
				   }else if(totalincome<=2700000){
					   double ti3=(totalincome-1200000)*0.18;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti3);
					   
				   }else if(totalincome<=3200000){
					   double ti4=(totalincome-1200000)*0.24;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti4);
					   
				   }else if(totalincome<=3700000){
					   double ti5=(totalincome-1200000)*0.30;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti5);
					   
				   }else if(totalincome>3700000){
					   double ti6=(totalincome-1200000)*0.36;
					   System.out.print("\n\nYou have to pay Income Tax per year : "+ti6);}
					   
			    }else{
				  System.out.print("\n\n\tYou are not required to pay Income tax."); 
				}
				
			}
		}
	}
}
   
	   
		
	

							  


