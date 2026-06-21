package codepractise;
import java.util.*;
public class Perfectnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(isPerfect(n)) {
			System.out.println("The "+n+" is a perfect number");
		}else {
			System.out.println("The "+n+" is not a perfect number");
		}

	}
	public static boolean isPerfect(int n) {
		if(n<1) {
			return false;
		}
		long divSum=1;
		for(long i=2;i*i<=n;i++) {
			if(n%i==0) {
				divSum+=i;
				if(i!=n/i) {
					divSum+=n/i;
				}
			}
		}
		if(divSum==n) {
			return true;
		}else {
			return false;
		}
	}

}
