import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Menstrual{

public static void main(String...args){

	Scanner scanner = new Scanner(System.in);
	DateTimeFormatter yearMonthDay  = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	System.out.println("Enter your name: ");
	String name = scanner.next();
	System.out.println("Welcome Mrs/Miss " + name);
	System.out.println("===================================================================================");

	LocalDate date = LocalDate.now();    
    	//LocalDate yesterday = date.minusDays(1);    
    	//LocalDate tomorrow = date.plusDays(1);
	
	System.out.println("Today's date is: " + date);    
    	//System.out.println("Yesterday date: " + yesterday);    
    	//System.out.println("Tomorrow date: " + tomorrow); 

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Welcome to SEMICOLON menstrual cycle App");
	System.out.println("Get details about your menstrual cycle below");

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Before you proceed we'd love to know your age");

	System.out.println("Please enter your age: ");
	int ageInput = scanner.nextInt();

	if (ageInput < 12) {
	System.out.println("You are not old enough to see your menstrual cycle");
	}

	else if (ageInput > 50) {
	System.out.println("You are too old enough to see your menstrual cycle");
	}

	
	else {

	System.out.println("Enter the last date you had your menstrual cycle(using this format yyyy-MM-dd): ");
	String menstrualDateInput = scanner.next();
	LocalDate dateOfStart = LocalDate.parse(menstrualDateInput, yearMonthDay);

	System.out.println("Enter how long your menstrual cycle last: ");
	int menstruationNextDays = scanner.nextInt();

	LocalDate nextMenstrualCycle = dateOfStart.plusDays(menstruationNextDays);
	System.out.println("Your next menstrual cycle begins on:  " + nextMenstrualCycle);

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Enter the days of your ovulation period: ");
	int ovulationInput = scanner.nextInt();
	
	int ovulationDate = 14;

	LocalDate ovulationdays = dateOfStart.plusDays(ovulationDate);
	System.out.println("Your next ovulation date is:  " + ovulationdays);

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("How many days is your flow period: ");
	int flowInput = scanner.nextInt();

	LocalDate flowPeriod = dateOfStart.plusDays(flowInput);
	System.out.println("Your menstrual cycle ends at:  " + flowPeriod);

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	int safePeriod = 7;

	LocalDate safestPeriod = dateOfStart.minusDays(safePeriod);
	System.out.println("Your safest period to have sex is:  " + safestPeriod + " so condom is not needed or contraceptive pills");

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	
	System.out.println("===================================================================================");
	System.out.println("===================================================================================");
	}
	
	
	}

}   
      
   
	