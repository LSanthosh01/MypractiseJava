package codepractise;
import java.util.*;
public class Fibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for fibanocci series:");
		int n=sc.nextInt();
		System.out.println("The fibanocci series of "+n+"is");
		fibanocci(n);
	}
	public static void fibanocci(int n) {
		if(n<0) {
			System.out.println("Number cannot be negative");
			return;
		}
		int first=0,second=1;
		for(int i=1;i<=n;i++) {
			System.out.println(first+"");
			int next=first+second;
			first=second;
			second=next;
		}
		System.out.println();
		
	}

}
