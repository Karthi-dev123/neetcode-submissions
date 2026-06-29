class Solution {
    public int minCostClimbingStairs(int[] cost) {
            if(cost == null) return 0;
            int[] dp = new int[cost.length];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for(int i = 2 ; i < cost.length ; i++){
                dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
            }

            return Math.min(dp[cost.length-1],dp[cost.length-2]);
                }
}
// 1. Handle edge cases (if any).

// 2. Create dp[].

// 3. Initialize:
//    dp[0] = cost[0];
//    dp[1] = cost[1];

// 4. Loop from i = 2 to n-1.

// 5. Fill:
//    dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];

// 6. Return:
//    Math.min(dp[n-1], dp[n-2]);

// if(cost.isEmpty()) return 0;
// int[] dp = new int[cost.length];
// dp[0] = cost[0];
// dp[1] = cost[1];
// for(int i = 2 ; i < cost.length ; i++){
//     dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
// }

// return Math.min(dp[cost.length-1],cost.length-2);