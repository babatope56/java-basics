package methods;
import java.util.Scanner;

public class SubstringCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a string: ");
		String stringXX = sc.nextLine();
		
		//Call Method
		int numXX = countXX(stringXX);
		
		//Output
		System.out.println("There are " + numXX + " overlapping xx's in your string");
		
		sc.close();

	}
	
	
	// ***METHOD: counts the overlapping xx's in a string
	public static int countXX(String stringXX) {
		
		String str = new String(stringXX);
		
		int counter = 0;
		for(int i=0; i<stringXX.length()-1; i++)
		{
			if (str.substring(i, i+2).equals("xx"))
			{
				counter++;
			}
			// System.out.println(str.substring(i, i+2)); --> code check
		}
		
		return counter++;

	}
		
}
