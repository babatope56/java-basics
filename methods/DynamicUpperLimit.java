package methods;
import java.util.Scanner;

public class DynamicUpperLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the temperature in Palo Alto: ");
		int temperature = sc.nextInt();
		
		System.out.println("Is it summer?\n(enter 'true' or 'false')");
		boolean isSummer = sc.nextBoolean();
		
		//Call Method
		boolean result = squirrelPlay(temperature, isSummer);
		
		//Output
		if (result == true) 
		{
			System.out.println("The squirrels are playing.");
		}
		
		else
		{
			System.out.println("The squirrels are not playing.");
		}
		
		sc.close();

	}
	
	
	// ***METHOD: Returns true based on combinations of two parameters
	public static boolean squirrelPlay(int temperature, boolean isSummer) {
		
		if(temperature>=60 && temperature <=100 && isSummer==true)
		{
			return true;
		}
		else if(temperature>=60 && temperature <=90 && isSummer==false)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
