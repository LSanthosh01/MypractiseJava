package practice;
import java.util.*;
public class BookAllocation {
	public static boolean isPossible(int arr[],int m,int maxpages) {
		int students=1;
		int currentpagesum=0;
		for(int pages:arr) {
			if(pages>maxpages) return false;
			
			if(currentpagesum+pages>maxpages) {
				students++;
				currentpagesum=pages;
				if(students>m) return false;
			}else {
				currentpagesum+=pages;
			}
		}
		return true;
	}
	
	public static int findPages(int arr[],int m,int n) {
		if(m>n) return -1;
		int low=0;
		int high=0;
		for(int pages:arr ) {
			low=Math.max(low, pages);
			high+=pages;
		}
		int result=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(isPossible(arr,m,mid)) {
				result=mid;
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int m=sc.nextInt();
		System.out.println("Enter the number of books:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the book pages:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Minimum of maximum pages: " + findPages(arr, m, n));
	}

}
