package classesAndObjects;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BoxCalculations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		//Input
		System.out.println("Enter the box's length (inches): ");
		double length = sc.nextDouble();
		
		System.out.println("Enter the box's depth (inches): ");
		double depth = sc.nextDouble();
		
		System.out.println("Enter the box's height (inches): ");
		double height = sc.nextDouble();
		
		System.out.println("Enter the box's cost (per square inch): ");
		double cost = sc.nextDouble();
		
		//Create object of type Box
		Box box = new Box(length, depth, height, cost);
		
		//Call methods
		double volume = box.getVolume(length, depth, height);
		double surfaceArea = box.getSurfaceArea(length, depth, height);
		double totalCost = box.getTotalCost(cost, length, depth, height);
		
		//Output
		System.out.println("The box's volume is " + df.format(volume) + " cubic inches.");
		System.out.println("The box's surface area is " + df.format(surfaceArea) + " cubic inches.");
		System.out.println("The cost per box is " + n.format(totalCost));
		
		sc.close();
		
	}

}
