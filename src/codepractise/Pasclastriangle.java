package codepractise;
import java.util.*;
public class Pasclastriangle {
	
	public static long factorial(int n) {
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static long combinate(int n,int k) {
		return factorial(n)/(factorial(k)*factorial(n-k));
	}
	public static void printPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int k=0;k<=i;k++) {
				long val=combinate(i,k);
				System.out.printf("%-4d",val);
				
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows to print:");
		int num=sc.nextInt();
		System.out.println("The Pascal triangle pattern");
		printPattern(num);
		

	}

}
