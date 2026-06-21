package practice;
import java.util.*;

public class AggressiveCows {
    // Corrected parameter order to match the call in main
    static boolean canPlace(int arr[], int n, int c, int dist) {
        int previous = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] - previous >= dist) {
                count++;
                previous = arr[i];
                
                if (count == c) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of cows:");
        int c = sc.nextInt();
        
        System.out.println("Enter the number of stalls:");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the positions of the stalls:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // ERROR FIX 1: You MUST sort the array for the distance logic to work
        Arrays.sort(arr);
        
        int low = 1; // Minimum possible distance is 1
        int high = arr[n - 1] - arr[0]; // Max distance is between first and last stall
        int res = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // ERROR FIX 2: Fixed the order of 'n' and 'c' to match method signature
            if (canPlace(arr, n, c, mid)) {
                res = mid;
                low = mid + 1; // Try to find a larger minimum distance
            } else {
                high = mid - 1; // Distance is too large, try smaller
            }
        }
        
        System.out.println("The largest minimum distance is: " + res);
        sc.close(); // Good practice to close the scanner
    }
}