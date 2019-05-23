package methods;
import java.util.Scanner;

public class xor {

	// ***MAIN METHOD: prints whether or not the two user entered booleans return true when passed through the xor function
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter true or false: ");
		boolean boolean1 = sc.nextBoolean();
		
		System.out.println("Enter true or false...again: ");
		boolean boolean2 = sc.nextBoolean();
		
		//Method Calls
		boolean result = xOr(boolean1, boolean2);

		//Output
		System.out.println("XOR determined it to be " + result);
		
		sc.close();
	}
	
	
	// ***METHOD: xor, returns true if a OR b is true but not if a AND b are true
	public static boolean xOr(boolean a, boolean b) {
		
		if((a || b) && !(a && b))
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
}
