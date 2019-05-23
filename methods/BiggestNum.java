package methods;
import java.util.Scanner;

public class BiggestNum {

	// ***METHOD: main 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter 1st integer: ");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd integer: ");
		int num2 = sc.nextInt();
		System.out.println("Enter 3rd integer: ");
		int num3 = sc.nextInt();
		
		max3(num1, num2, num3);
		
		sc.close();

	}

	// ***METHOD: returns the largest of three integers
	public static void max3(int num1, int num2, int num3) {
		
		if(num1 >= num2 && num1 >= num3) //Case 1
		{
			System.out.println(num1 + " is the largest");
		}
		
		else if(num2 >= num1 && num2 >= num3) //Case 2
		{
			System.out.println(num2 + " is the largest");
		}
		
		else //Case 3
		{
			System.out.println(num3 + " is the largest");
		}
	
		
	}
	
}
