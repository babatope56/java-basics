package methods;
import java.util.Scanner;


public class MethodIntro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		add(a,b);
		
		sc.close();
	}
	
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
