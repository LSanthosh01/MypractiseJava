package codepractise;
import java.util.*;
public class NumberDigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int sum=0;
		int originalNum = n; 
		while(n>0) {
			int last=n%10;
			sum+=last;
			n=n/10;
		}
		System.out.println("The sum of digits is:"+sum);
		int sum1=0;
		
		int temp = originalNum;        
		int digits = 0;
		while(temp > 0) {
		    digits++;
		    temp = temp / 10;
		}

		temp = originalNum; 
		while(temp > 0) {
		    int last = temp % 10;
		    sum1 += (int) Math.pow(last, digits);
		    temp = temp / 10;
		}

		if(sum1 == originalNum) {
		    System.out.println("The given number is an Armstrong number");
		} else {
		    System.out.println("The given number is NOT an Armstrong number");
		}

	}

}
