package practice;
import java.util.*;

public class CoinChange {
    /**
     * Finds the minimum number of coins needed to make up a given amount.
     * @param coins Array of coin denominations
     * @param amount The target sum
     * @return Minimum coins required, or -1 if the amount cannot be formed
     */
    static int change(int[] coins, int amount) {
        // 1. Initialize DP table. max is 'amount + 1' because the most coins 
        // we could ever use is 'amount' (using all 1-cent coins).
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        
        // Fill the array with the 'max' value as a placeholder for infinity
        Arrays.fill(dp, max);
        
        // Base case: 0 coins are needed to make the amount 0
        dp[0] = 0;

        // 2. Iterate through every sub-amount from 1 to the target amount
        for (int i = 1; i <= amount; i++) {
            // Check every coin denomination
            for (int coin : coins) {
                if (coin <= i) {
                    // 3. CORE LOGIC: Use Math.min, not Math.max.
                    // We want the fewest coins possible.
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // 4. If dp[amount] is still 'max', it means no combination worked
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of coins:");
        int n = sc.nextInt();
        int[] coins = new int[n];
        
        System.out.println("Enter the coins denominations:");
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        
        System.out.println("Enter the amount:");
        int amount = sc.nextInt();
        
        int result = change(coins, amount);
        
        if (result == -1) {
            System.out.println("The amount cannot be formed with the given denominations.");
        } else {
            System.out.println("Minimum coins needed: " + result);
        }
        
        sc.close();
    }
}