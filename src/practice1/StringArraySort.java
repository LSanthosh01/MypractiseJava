package practice1;
import java.util.*;

public class StringArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(getNum(a), getNum(b)));
        System.out.println("The sorted array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static int getNum(String s) {
        String num = "";
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num += ch;
            }
        }
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }
}