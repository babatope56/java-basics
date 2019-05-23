package variableAssignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//User input
		System.out.println("Enter the base width of the triangle: ");
		double base = sc.nextDouble();
		System.out.println("Enter the height of the triangle: ");
		double height = sc.nextDouble();
		
		//Calculations
		double area = 0.5*base*height;
		
		//Output
		DecimalFormat df = new DecimalFormat("#,###.##"); //shows up to two decimal places
		System.out.println("The area of the triangle is: " + df.format(area));
		
		sc.close();
		
	}

}
