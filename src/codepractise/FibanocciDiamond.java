package codepractise;
import java.util.*;
public class FibanocciDiamond {
	private int a=0;
	private int b=1;
	
	private  int fibanocci() {
		int next=a;
		int sum=a+b;
		a=b;
		b=sum;
		return next;
	}
	public void printDiamond(int n) {
		if(n%2==0) {
			System.out.println("Please enter the odd value to print diamond pattern");
			return;
		}
		int mid=(n/2)+1;
		for(int i=1;i<=mid;i++) {
			for(int j=1;j<=mid-i;j++) {
				System.out.print("      ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%-12d",fibanocci());
			}
			System.out.println();
		}
		
		for(int i=mid-1;i>=1;i--) {
			for(int j=1;j<=mid-i;j++) {
				System.out.print("      ");
			}
			for(int k=1;k<=i;k++) {
				System.out.printf("%-12d",fibanocci());
			}
			System.out.println();
		}
		 
	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		FibanocciDiamond fb=new FibanocciDiamond();
		System.out.println("Enter the number of rows to print the pattern(odd rows):");
		int n=sc.nextInt();
		System.out.println("The Fibanocci diamond pattern:");
		fb.printDiamond(n);

	}

}
