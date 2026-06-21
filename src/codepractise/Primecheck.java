package codepractise;
import java.util.*;
public class Primecheck {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int n=sc.nextInt();
		if(isPrime(n)) {
			System.out.println("The "+n+" is a prime number");
		}else {
			System.out.println("The "+n+" is not a prime number");
		}
		
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return true;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
