package methods;
import java.util.Scanner;

public class FactorPerfectPrime {

	// ***MAIN METHOD
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Input: isFactor
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Enter a number to see if it's a factor: ");
		int potentialFactor = sc.nextInt();
		
		//Call Method: isFactor
		boolean factorResult = isFactor(num, potentialFactor);
		
		//Output: isFactor
		if(factorResult == true)
		{
			System.out.println(potentialFactor + " is a factor of " + num);
		}
		
		else
		{
			System.out.println(potentialFactor + " is not a factor of " + num);
		}
		
		//Input: isPerfect
		System.out.println("Enter a number to see if it's perfect: ");
		int potentialPerfect = sc.nextInt();
		
		//Call Method: isPerfect
		boolean perfectResult = isPerfect(potentialPerfect);
		
		//Output: isPerfect
		if(perfectResult == true)
		{
			System.out.println(potentialPerfect + " is a perfect number");
		}
		
		else
		{
			System.out.println(potentialPerfect + " is not a perfect number");
		}
		
		//Input: isPrime
		System.out.println("Enter a number to see if it's prime: ");
		int potentialPrime = sc.nextInt();
		
		//Call Method: isPrime
		boolean primeResult = isPrime(potentialPrime);
		
		//Output: isPrime
		if(primeResult == true)
		{
			System.out.println(potentialPrime + " is a prime number");
		}
		
		else
		{
			System.out.println(potentialPrime + " is not a prime number");
		}
		
		
		sc.close();
	}
	
	
	// ***METHOD: returns true if k is a factor of n
	public static boolean isFactor(int n, int k) {
		
		if(k == 0 || n == 0)
		{
			return false;
		}
		else if(n % k == 0) 
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	// ***METHOD: returns true if n is a perfect number
	public static boolean isPerfect(int n) {
		
		int sumFactors = 1; 
		for(int i=2; i<n; i++) { // Every number is divisible by 1, so start for loop at 2
		
			boolean factorResult = isFactor(n, i);
			if(factorResult == true)
			{
				sumFactors += i;
			}
		}
		
		/*
		 * if(n == sumFactors) { return true; } //worst way
		 * 
		 * else { return false; }
		 */ 
		
		// return (n == 0)? true: false; //okay way
		 
		return (n == sumFactors); //best way!
		
	}
	
	
	// ***METHOD: returns true if n is prime
	public static boolean isPrime(int n) {
		
		if(n == 1)
		{
			return false;
		}
		
		for(int i=2; i<n; i++) { // Every number is divisible by 1, so start for loop at 2
		
			boolean factorResult = isFactor(n, i);
			if(factorResult == true) 
			{
				return false;
			}
		}
		return true;
			
	}
}
