package practice1;

import java.util.*;

public class BookAllocation {
    public static boolean isPossible(int[] arr, int m, int maxPages) {
        int studentsRequired = 1;
        int currentPagesSum = 0;

        for (int pages : arr) {
           
            if (pages > maxPages) return false;

            if (currentPagesSum + pages > maxPages) {
      
                studentsRequired++;
                currentPagesSum = pages;
                if (studentsRequired > m) return false;
            } else {
                currentPagesSum += pages;
            }
        }
        return true;
    }

    public static int findPages(int[] arr, int n, int m) {
       
        if (m > n) return -1;

        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;   
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, m, mid)) {
                result = mid;      
                high = mid - 1;
            } else {
                low = mid + 1;     
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        int n = arr.length;

        System.out.println("Minimum of maximum pages: " + findPages(arr, n, m)); 
    }
}

