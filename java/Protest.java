import java.util.Random;
public class Protest{

	public static void main(String...dave){

	System.out.println("Protest is on-going in Nigeria");
	System.out.println("Below are few demands by the protesters in Nigeria");
	System.out.println("Let Go!");

	Random rand = new Random();
	int picks = rand.nextInt(1,10);
	
	if(picks == 1){
	System.out.println("End to end to anti-people policies.");
	}

	else if (picks == 2){
	System.out.println("Reversal of fuel price.");
	}
	
	else if (picks == 3){
	System.out.println("Restructuring of Nigeria to accommodate Nigeria's diversity, resources control, decentralization and regional developments.");
	}
	
	else if (picks == 4){
	System.out.println("Reinstate a corruption-free subsidy regime to reduce hunger,starvation and multidimensional poverty.");
	}

	else if (picks == 5){
	System.out.println("The protesters demand a transparency and accountability in governance, including the problic disclosure and reduction of public officials's sslaries and allowances.");
	}

	else if (picks == 6){
	System.out.println("Increase in the national minimum wage to N300,000, contrasting with the N70,000 recently signed into law by Tinubu.");
	}

	else if (picks == 7){
	System.out.println("The protesters are also demanding the reversal of the hike in tertiary Education fees by many institutions.");
	}

	else if (picks == 8){
	System.out.println("They are calling for a probe of the past and present Nigerian Leaders who have looted the treasury.");
	}

	else if (picks == 9){
	System.out.println("They demand public school mandates by ensuring that children of all public office holder attend public schools in the country.");
	}
	
	else if (picks == 10){
	System.out.println("Additionally, they are calling for reforms in the Economy and Financial Crime Commission (EFCC) a state of emergency and inflation.");
	}

	}

}