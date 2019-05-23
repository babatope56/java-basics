package methods;
import java.util.Scanner;

public class DisplaySameDigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter two whole numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//Call Method
		int result = sumLimit(num1, num2);
		
		//Output
		if(result == num1)
		{
			System.out.println("The first number is: " + result);
		}
		else
		{
			System.out.println("The sum is: " + result);
		}
		
		sc.close();

	}
	
	
	// ***METHOD: returns a or a+b depending on if the number digits are equal
	public static int sumLimit(int a, int b) {
		
		int sum = a + b;
		int aDigits = (Integer.toString(a)).length();
		int sumDigits = (Integer.toString(sum)).length();
		
		return (aDigits == sumDigits) ? sum : a;

	}

}
