package methods;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DisplayConditionalValue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the three numbers on your lottery ticket: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		//Call Method
		int result = greenTicket(num1, num2, num3);
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US); //sets the currency to US dollar
		
		//Output
		System.out.println("You got " + n.format(result));
		
		sc.close();

	}
	
	
	// ***METHOD: Returns different values depending on the number of values equal to one another
	public static int greenTicket(int a, int b, int c) {
		
		if(a == b && b ==c)
		{
			return 20;
		}
		else if(a != b && b != c && a != c)
		{
			return 0;
		}
		else
		{
			return 10;
		}

	}

}
