import java.util.Scanner;
public class CreditCard{

public static void main(String...args){

	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome dear valued customer to validate your credit card");
	System.out.println ("Enter your credit card details: ");
	String cardInput = sc.next();

	if (cardInput.length()  <  13 || cardInput.length()  >  16){
	//System.out.println("Invalid");
	//}
	//else{
	//System.out.println("Valid");
	}

	System.out.println();
	System.out.println();
	
	System.out.println("*********************************************************");

	if (cardInput.charAt(0) == '4'){
	System.out.println("**Credit Card Type: Visa Card");
	}

	else if (cardInput.charAt(0) == '5'){
	System.out.println("**Credit Card Type: MasterCard");
	}

	else if (cardInput.charAt(0) == '3' && cardInput.charAt(1) == '7'){
	System.out.println("**Credit Card Type: American Express Card");
	}

	else if (cardInput.charAt(0) == '6'){
	System.out.println("**Credit Card Type: Discover Card");
	}

	else{
	System.out.println("**Credit Card Type: Invalid Card");
	}

	
	int total = 0;

	for (int num = cardInput.length()-2; num >= 0; num -=2){
	int digits = Integer.parseInt(String.valueOf(cardInput.charAt(num))); 
	digits = digits * 2;
	if(digits  > 9)
	digits = digits / 10 + digits % 10;
	total += digits;
	}
	//System.out.println("The total is: " + total);
	
	int oddValue = 0; 
	for(int index = cardInput.length() -1; index >= 0; index -=2){
	int numbers = Integer.parseInt(String.valueOf(cardInput.charAt(index)));
	oddValue += numbers;
	}
	//System.out.println("The oddvalue is: " + oddValue);


	System.out.println("**Credit Card Number: " + cardInput);

	System.out.println("**Credit Card Digit Length: " + cardInput.length());

	int sum = total + oddValue;

	if (sum % 10 == 0) {
	System.out.println("**Credit Card Validity Status: Valid");
	}
	else {
	System.out.println("**Credit Card Validity Status: Invalid");
	}

	System.out.println("*********************************************************");

	}

}




	

