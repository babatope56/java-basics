package variableAssignment;
import java.util.Scanner;

public class AlphabetASCII {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter one symbol from the keyboard: ");
		char symbol = sc.next().charAt(0);
		
		//Calculations
		int ascii = (int) symbol;
		
		//Output
		System.out.println("The ASCII code for " + symbol + "is " + ascii);
		
		sc.close();

	}

}
