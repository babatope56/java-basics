package stringVariables;
import java.util.Scanner;

public class EvenUpperOddLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a word, phrase, or sentence: ");
		String text = sc.nextLine();
		
		
		//Logic
		String formattedWord = "";
		for(int i=0; i<text.length(); i++)
		{
			if(i % 2 == 1)
			{
				formattedWord += Character.toUpperCase(text.charAt(i));
			}
			
			else
			{
				formattedWord += Character.toLowerCase(text.charAt(i));
			}
		}
		
		
		//Output
		System.out.print(formattedWord);
		
		sc.close();

	}

}