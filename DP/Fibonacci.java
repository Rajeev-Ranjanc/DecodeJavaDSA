package DP;

import java.util.Arrays;

/*

Memoization

 */
public class Fibonacci {
    public static void main(String[] args) {

//        System.out.println(nthFibo(5));

        /*
        int n = 12;
        // third step
        int[] a = new int[n + 1];

        // 3 steps to convert recursion into dp
        //step 1
        Arrays.fill(a, -1);

        System.out.println(FibonacciNumber(n, a));

         */
        System.out.println(Fib_Rec_Tabulation_Optimal(12));
    }

    public static int nthFibo(int n) {
//      this is dp
        if (n == 0) {
            return 0;
        }

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static int fiboRecursion(int n) {
// this is not DP
        if (n <= 1) {
            return 1;
        }
        return fiboRecursion(n - 1) + fiboRecursion(n - 2);
    }

    public static int FibonacciNumber(int n, int[] dp) {
//        this is memoization
//        TOP-DOWN Approach
        //3 steps to change recursion into DP
//      base case

        if (n <= 1) {
            return n;
        }
        //memoization
        if (dp[n] != -1) {
            return dp[n];
        }
        //step 2
        return dp[n] = FibonacciNumber(n - 1, dp) + FibonacciNumber(n - 2, dp);
//      Time complexity : O(n) how? then f[5] calling-> f[4] -> f[3] ->f[2] and f[5] calling f[4] and f[3]. tc of calling
//        f[3] is O(1) because we are fetching from array.

//        Space Complexity : O(n) for recursion stack + O(n) for arrays

    }

    public static int Fib_Rec_Tabulation(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

//        TC : O(n)
//        SC : O(n) // what if i need to do this in much better way? see next function

    }

    public static int Fib_Rec_Tabulation_Optimal(int n) {
        // what if I need to do this in much better way? I mean to optimize the SC? how then see this!
        if (n <= 1) {
            return n;
        }
        int prev2 = 0;
        int prev1 = 1;

        for (int i = 2; i <= n; i++) {
            int curr = prev2 + prev1;
            prev2 = prev1;
            prev1 = curr;

        }

        return prev1;

//        Now
//        TC : O(n)
//        SC : O(1)


    }

}
