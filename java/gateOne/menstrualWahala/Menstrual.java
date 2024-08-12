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
    	LocalDate yesterday = date.minusDays(1);    
    	LocalDate tomorrow = date.plusDays(1);
	
	System.out.println("Today date: " + date);    
    	System.out.println("Yesterday date: " + yesterday);    
    	System.out.println("Tomorrow date: " + tomorrow); 

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Welcome to your menstrual cycle App");
	System.out.println("Get details about your menstrual cycle below");

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Enter the last date you had your menstrual cycle(using this format yyyy-MM-dd): ");
	String menstrualDateInput = scanner.next();
	LocalDate dateOfStart = LocalDate.parse(menstrualDateInput, yearMonthDay);

	int menstruationNextDays = 30;

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
	System.out.println("Your safest period to have sex is:  " + safestPeriod);

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Enter your age: ");
	int age = scanner.nextInt();

	int child = 11;
	int adult = 25;
	int old = 45;

	if(age <= child){
	System.out.println("You are too young to menstrate");
	} 

	else if(age == adult || age <= 44){
	System.out.println("You are old enough to see your menstrual cycle");
	}

	else if(age == old || age <= 100){
	System.out.println("You are at your menopause stage and you can't menstrate no more");
	}

	else{
	System.out.println("Guess you inputted a funny age");
	}

	System.out.println("===================================================================================");
	System.out.println("===================================================================================");
	
	
	}

}   
      
   
	