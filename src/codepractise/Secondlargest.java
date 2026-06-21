package codepractise;
import java.util.*;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				secondLargest=largest;
				largest=a[i];
			}else if(a[i]>secondLargest&&a[i]!=largest) {
				secondLargest=a[i];
			}
		}
		if(secondLargest==Integer.MAX_VALUE) {
			System.out.println("There is no second largest element in the array");
		}else {
			System.out.println("The first largest numnber is:"+largest);
		    System.out.println("The second largest number is:"+secondLargest);
		}
	}

}
