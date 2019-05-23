package variableAssignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BmiCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter your height (in): ");
		double height = sc.nextDouble();
		System.out.println("Enter your weight (lbs): ");
		double weight = sc.nextDouble();
		
		
		//Calculations
		double bmi = (weight / Math.pow(height, 2))*703;
		
		
		//Output
		DecimalFormat df = new DecimalFormat("#.0"); //shows one decimal place, even if 0
		System.out.println("Your BMI is: " + df.format(bmi));
		
		sc.close();

	}

}
