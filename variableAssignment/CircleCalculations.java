package variableAssignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleCalculations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter the circle's radius: ");
		double radius = sc.nextDouble();
		
		//Calculations
		double area = Math.PI*Math.pow(radius, 2);
		double circumference = 2*Math.PI*radius;
		
		//Output
		DecimalFormat df = new DecimalFormat("#,###.##"); //shows up to two decimal places
		System.out.println("The area of the circle is: " + df.format(area) + 
				"\nThe circumference of the circle is: " + df.format(circumference));
		
		sc.close();

	}

}
