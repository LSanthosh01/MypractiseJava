package codepractise;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("The elements from largest to smallest:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
