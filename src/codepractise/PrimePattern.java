package codepractise;
import java.util.*;
public class PrimePattern {
	public static boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void generatePattern(int n) {
		int current=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=i;k++) {
				while(!isPrime(current)) {
					current++;
				}
				System.out.printf("%-6d",current);
				current++;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print pattern:");
		int num=sc.nextInt();
		System.out.println("Prime numbers pyramid");
		generatePattern(num);

	}

}
