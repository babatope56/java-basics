package methods;
import java.util.Scanner;

public class DuplicateStrings {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a string: ");
		String originalString = sc.nextLine();
		
		System.out.println("Enter the number of times you want to repeat the string: ");
		int repeatNum = sc.nextInt();
		
		//Call Method
		String repeatString = stringTimes(originalString, repeatNum);
		
		//Output
		System.out.println("Here's your string repeated " + repeatNum + " times: " + repeatString);
		
		sc.close();

	}
	
	
	// ***METHOD: repeat the string x number of times
	public static String stringTimes(String originalString, int repeatNum) {
		
		String repeatString = originalString.repeat(repeatNum);
		return repeatString;

	}
		
}