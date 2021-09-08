package com.dynamic_prog;

public class ClimpingStairs {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs2(n));
    }
    // Dynamic Programming Approach
    public static int climbStairs(int n) {
        if (n == 0) return 0; 
        if (n == 1) return 1;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // Approach: Fibonacci Number
    public static int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        int first = 1;

        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}