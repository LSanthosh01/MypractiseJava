package codepractise;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			boolean isDuplicate=false;
			for(int k=i+1;k<n;k++) {
				if(a[i]==a[k]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				temp[j]=a[i];
				j++;
			}
		}
		System.out.println("The unique elements after removing duplicates:");
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]+" ");
		}
		
      sc.close();
	}

}
