package practice;
import java.util.*;
public class MyClass {
	static int check(int[] battery,int hours) {
		int n=battery.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(battery[i]>=hours) {
				count+=1;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the meeting hours:");
		int hours=sc.nextInt();
		System.out.println("Enter the no.of battery levels:");
		int n=sc.nextInt();
		int[] battery=new int[n];
		System.out.println("Enter the battery levels:");
		for(int i=0;i<n;i++) {
			battery[i]=sc.nextInt();
		}
		System.out.println(check(battery,hours));
	}

}
