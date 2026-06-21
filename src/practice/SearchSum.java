package practice;
import java.util.*;
public class SearchSum {
	static boolean find(int arr[],int n,int target) {
		int left=0,right=n-1;
		while(left<right) {
			if(arr[left]+arr[right]==target) {
				return true;
			}else if(arr[left]<target) {
				left++;
			}else {
				right--;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target:");
		int target=sc.nextInt();
		if(find(arr,n,target)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
