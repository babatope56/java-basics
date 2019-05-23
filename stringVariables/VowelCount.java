package stringVariables;
import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//Input
		System.out.println("Enter a word, phrase, or sentence: ");
		String text = sc.nextLine();
		
		//Logic
		int counter = 0;
		for(int i=0; i<text.length(); i++)
		{
			if( text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')
			{
				counter++;
			}
		}

		//Output
		System.out.println("The number of vowels is: " + counter);
		
		sc.close();
	}

}
