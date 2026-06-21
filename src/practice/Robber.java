package practice;
import java.util.*;
public class Robber {
	static int rob(int[] nums) {
		int p1=0,p2=0,n=nums.length;
		int dp[]=new int[n];
		for(int i=0;i<n;i++) {
			dp[i]=Math.max(p1,p2+nums[i]);
			p2=p1;
			p1=dp[i];
		}
		return dp[n-1];
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of houses:");
		int n=sc.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter the money in each house:");
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("You can rob total of:"+rob(nums));

	}

}
