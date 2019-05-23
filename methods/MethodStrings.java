package methods;
import java.util.Scanner;

public class MethodStrings {
	
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter first name: ");
			String firstName = sc.nextLine();
			System.out.println("Enter last name: ");
			String lastName = sc.nextLine();
			
			int result = countStringLength(firstName, lastName);
			System.out.println(result);
			
			sc.close();

		}

	
	//	**Method that counts the total length of two strings**
	public static int countStringLength(String a, String b) {
		
		
		return a.length() + b.length();
		
	}
		
	}