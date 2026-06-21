package practice;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
	int i,factorial=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find the factorial:");
	int n=sc.nextInt();
	for(i=1;i<=n;i++) {
		factorial=factorial*i;
		
	}
	System.out.println("Factorial of the number:"+factorial);
	//System.out.println(factorial);
	}

}
