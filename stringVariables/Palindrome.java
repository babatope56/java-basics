package stringVariables;
import java.util.Objects;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a word: ");
		String forwards = sc.next();


		
		//Logic & Output
		String backwards = "";
		for(int i=forwards.length()-1; i>=0; i--)
		{
			backwards += forwards.charAt(i);
		}
		
		if (Objects.equals(forwards, backwards))
		{
			System.out.println(":D\n" + forwards + " is a palindrome.");
		}
		
		else
		{
			System.out.println(":(\n" + forwards + " is not a palindrome.");
		}

		sc.close();
		
	}

}