package classesAndObjects;
import java.util.Scanner;

public class DateFormatter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the month, day, and year: ");
		int month = sc.nextInt();
		int day = sc.nextInt();
		int year = sc.nextInt();
		
		//Object
		Date date = new Date(month, day,year);
		
		//Call method
		String formattedDate = date.displayDate(month, day, year);
		
		//Output
		System.out.println("The formatted date is " + formattedDate);
		
		sc.close();
		
	}

}
