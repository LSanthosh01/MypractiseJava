package practice;
import java.util.*;

public class Factorials {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Check for negative input before processing
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = Factorial(num);
            // Changed 'fact' to 'result' to print the actual calculated value
            System.out.println("The factorial is: " + result); 
        }
        sc.close(); // Good practice to close the scanner
    }

    public static int Factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1; // Must return 1 to stop recursion
        }
        
        // Recursive case
        int res = n * Factorial(n - 1);
        return res;
    }
}