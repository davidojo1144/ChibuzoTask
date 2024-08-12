import java.util.Random;
import java.util.Scanner;
public class AutomatedBankApp{

public static void main(){

	Scanner sc = new Scanner(System.in);

	Random rand = new Random();
	Long accountNumber = rand.nextLong(100000000L,900000000L);

	int deposit = 0;
	int total = 0;

	deposit += total;

	System.out.println("You're welcome to GTBANK");
	System.out.println("1. Create an account with your first name and last name and pin.");
	System.out.println("2. Deposit money.");
	System.out.println("3. Withdraw money.");
	System.out.println("4. Check Account balance.");
	System.out.println("5. Transfer from one account to another.");
	System.out.println("6. Change Pin.");
	System.out.println("7. Close account.");
	System.out.println("Choose between 1 to 7 what you'd love to do");
	int create = sc.nextInt();

	switch(create){
			case 1: System.out.println("Create an account and a pin of your choice.");
			System.out.println("Enter your Firstname");
			String name = sc.next();
			System.out.println("Enter your Surname");
			String name2 = sc.next();
			System.out.println("Enter a pin of your choice");
			int pin = sc.nextInt();
			System.out.println("Your Bank account has been successfully created. \nWe'd love to have you on board.");
			System.out.println("Your account number is: " +  accountNumber);
			main();

			System.out.println();

			case 2: System.out.println("Deposit money.");
			System.out.println("Enter the amount of money you'd love to deposit: ");
			deposit = sc.nextInt();
			System.out.println("Your money has been successfully deposited into your account");
			main();

			System.out.println();

			case 3: System.out.println("Withdraw money.");
			System.out.println("Enter the amount of money you'd love to withdraw: ");
			int withdraw = sc.nextInt();
			main();

			System.out.println();

			case 4: System.out.println("Check Account balance.");
			System.out.println(deposit);
			main();

			System.out.println();

			case 5: System.out.println("Transfer from one account to another.");
			main();

			System.out.println();

			case 6: System.out.println("Change Pin.");
			System.out.println("Change your bank pin below");
			System.out.println("Input your old pin:");
			int oldPin = sc.nextInt();
			main();

			System.out.println();

			case 7: System.out.println("Close account.");
			System.out.println("We are so sad to see you GO!");
			System.out.println("To close your account you'd have to press 1");
			System.out.println("Press 1 to permanently close your account or 2 to temporary deactivate it:");
			int close = sc.nextInt();
			if(close == 1){
			System.out.println("Your account has been permanently closed");
			}
			else if(close == 2 ){
			System.out.println("Your account has been temporary deactivated");
			}
			else{
			System.out.println("You've inputted a wrong number");
			}
			main();

			default: System.out.println("inputed a wrong number");
			break;
		}

}
			public static void main(String...dave){
			main();
			}

}
	
	

	
	

	



	
	

	
	

	
		
	