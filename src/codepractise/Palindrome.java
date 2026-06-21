package codepractise;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int original=n;
		int reverse=0;
		while(n>0) {
			int last=n%10;
			reverse=(reverse*10)+last;
			n=n/10;
		}
		if(reverse==original) {
			System.out.println("The number "+original+" is a palindrome");
		}else {
			System.out.println("The number "+original+" is not a palindrome");
		}
		sc.nextLine();
		System.out.println("Enter the word:");
		String str=sc.nextLine();
		String str1=str.toLowerCase();
		boolean isPalindrome=true;
		int left=0;
		int right=str1.length()-1;
		while(left<right) {
			if(str1.charAt(left)!=str1.charAt(right)) {
				isPalindrome=false;
				break;
			}
			left++;
			right--;
		}
		if(isPalindrome) {
			System.out.println("The word "+str+" is a palindrome");
		}else {
			System.out.println("The word "+str+" is not a palindrome");
		}
		
	}

}
