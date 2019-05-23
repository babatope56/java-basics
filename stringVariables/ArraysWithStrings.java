package stringVariables;

public class ArraysWithStrings {

	public static void main(String[] args) {

		//Input
		String name = "Claim Academy";
		
		
		//Logic & Output
		for(int i=0; i<name.length(); i++)
		{
			System.out.println("Letter " + name.charAt(i) + " is at position " + i);
		}
	}

}
