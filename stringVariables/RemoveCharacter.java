package stringVariables;
import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a word, phrase, or sentence: ");
		String text = sc.nextLine();
		System.out.println("Enter your least favorite letter: ");
		char letter = sc.nextLine().charAt(0);
		
		//Logic
		String formattedText = "";
		for(int i=0; i<text.length(); i++)
		{
			if(text.charAt(i) != letter)
			{
				formattedText += text.charAt(i);
			}
		}
		
		//Output
		System.out.println("Here's your input without all the nasty " + letter + "'s: " + formattedText);
		
		sc.close();
	}

}
