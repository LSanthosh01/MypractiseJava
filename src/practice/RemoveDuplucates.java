package practice;
import java.util.*;
public class RemoveDuplucates {
	static int fun(int arr[],int n) {
		int slow=0;
		for(int fast=1;fast<n;fast++) {
			if(arr[slow]!=arr[fast]) {
				slow++;
				arr[slow]=arr[fast];
			}
		}
		return slow+1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(fun(arr,n));

	}

}
