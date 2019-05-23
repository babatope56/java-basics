package stringVariables;
import java.util.Scanner;

public class ForStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter an integer: "); //Enter 1st number
		while (!sc.hasNextInt())
		{        
		    sc.next(); //Discard if non-integer
		    System.out.print("Please enter an integer: "); //Re-prompt
		}
		int num1 = sc.nextInt();	
		
		
		System.out.println("Enter another integer: "); //Enter 2nd number
		while (!sc.hasNextInt())
		{        
		    sc.next(); //Discard if non-integer
		    System.out.print("Please enter an integer: "); //Re-prompt
		}
		int num2 = sc.nextInt();	
		
		
		//Logic & Output
		if(num1 < num2) //Condition 1
		{
			for(int i=num1; i<=num2; i++)
			{
				System.out.print(i+" ");
			}
		}
		
		else if(num1 > num2) //Condition 2
		{
			for(int i=num2; i<=num1; i++)
			{
				System.out.print(i+" ");
			}
		}
		
		else //Edge case
		{
			System.out.print(num1);
		}
		
		sc.close();
		
	}

}
