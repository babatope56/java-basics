package methods;
import java.util.Scanner;

public class MinMaxMedian {

	// ***MAIN METHOD: outputs the minimum, median, and maximum values
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter 1st integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd integer: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd integer: ");
		int num3 = sc.nextInt();
		
		//Method Calls
		int minNum = min3(num1, num2, num3);
		int maxNum = max3(num1, num2, num3);
		int median = median3(num1, num2, num3);
		
		//Output
		System.out.println("The minimum value is: " + minNum + 
						"\nThe median value is: " + median + 
						"\nThe maximum value is: " + maxNum);
		
		sc.close();

	}

	// ***METHOD: returns the minimum value of three integers
	public static int min3(int num1, int num2, int num3) {
		
		if(num1 <= num2 && num1 <= num3) //Case 1: num1 is min
		{
			return num1;
		}
		
		else if(num2 <= num1 && num2 <= num3) //Case 2: num2 is min
		{
			return num2;
		}
		
		else //Case 3: num3 is min
		{
			return num3;
		}
	}
	
	
	// ***METHOD: returns the maximum value of three integers
	public static int max3(int num1, int num2, int num3) {
		
		if(num1 >= num2 && num1 >= num3) //Case 1: num1 is max
		{
			return num1;
		}
		
		else if(num2 >= num1 && num2 >= num3) //Case 2: num2 is max
		{
			return num2;
		}
		
		else //Case 3: num3 is max
		{
			return num3;
		}
	}
		
		
	// ***METHOD: returns the median of three integers
	public static int median3(int num1, int num2, int num3) {
		
		int sum3 = num1 + num2 + num3;
		int median = sum3 - min3(num1, num2, num3) - max3(num1, num2, num3); //leaves the median by subtracting out min and max
		return median;
	}	
		
	
}
