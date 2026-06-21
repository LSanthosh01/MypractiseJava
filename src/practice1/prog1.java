package practice1;
import java.util.*;

public class prog1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to calculate the table:");
		int n=sc.nextInt();
		System.out.println("Enter the number of times to calculate the table:");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			int res=n*i;
			System.out.println(n+"*"+i+"="+res);
		}
		
	}

}
