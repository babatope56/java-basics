package variableAssignment;
import java.util.Scanner;

public class DoubleToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter a decimal number: ");
		double deciNum = sc.nextDouble();
		
		//Calculations
		int intNum = (int) Math.round(deciNum);
		
		//Output
		System.out.println("You entered " + deciNum + ". The rounded value is " + intNum + ".");
		
		sc.close();

	}
	
}
