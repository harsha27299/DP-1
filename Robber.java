/*this implementation uses dynamic programming approach to rob the houses
 * the time complexity of this approach is O(n)*/
public class Robber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[nums.length - 1];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Robber robber = new Robber();
        int maxAmount = robber.rob(nums);
        System.out.println("Maximum amount that can be robbed: " + maxAmount);
    }
}
