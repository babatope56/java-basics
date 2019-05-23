package stringVariables;

public class ArraysPrintA {

	public static void main(String[] args) {
		
		//Input
		String name = "Claim Academy";
		int count = 0;
		
		//Logic
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='A')
			{
				count++;
			}
		}
		
		//Output
		System.out.println(count);
	}

}
