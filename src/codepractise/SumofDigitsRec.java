package codepractise;
import java.util.*;
public class SumofDigitsRec {
	public static int sumRecur(int n) {
		if(n<0) {
			System.out.println("The number is negative pls check");
		}
		if(n==0) {
			return 0;
		}
		return n%10+sumRecur(n/10);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int result=sumRecur(n);
		System.out.println("The sum of digits of "+n+" is:"+result);
	}

}
