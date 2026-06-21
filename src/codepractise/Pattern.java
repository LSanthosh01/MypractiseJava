package codepractise;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print the pattern");
		int n=sc.nextInt();
		/*(for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}*/
		//number pattern
		System.out.println("Pattern1");
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "); // Prints the row index
            }
            for(int k=1;k<=i;k++) {
            	System.out.print(i + " ");
            }
            System.out.println();
        }
		System.out.println("Pattern 2");
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "); // Prints the row index
            }
            for(int k=1;k<=i;k++) {
            	System.out.print( k + " ");
            }
            System.out.println();
        }
		int count=1;
		System.out.println("Pattern 3");
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
            	System.out.print( count + " ");
            	count++;
            }
            System.out.println();
        }
	}

}
