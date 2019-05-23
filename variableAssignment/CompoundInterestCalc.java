package variableAssignment;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CompoundInterestCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter your investment amount: ");
		double investment = sc.nextDouble();
		System.out.println("Enter your monthly interest rate: ");
		double rate = sc.nextDouble();
		System.out.println("Enter the number of years the money is invested: ");
		double years = sc.nextDouble();
		
		
		//Calculations
		double fv = investment + Math.pow(1 + rate/100, years*12);
		
		//Output
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); //sets the currency to US dollar
		System.out.println("The future value of your investment is: " + n.format(fv)); //displays formatted fv (note: does round)
		
		sc.close();

	}

}
