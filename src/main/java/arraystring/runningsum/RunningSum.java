package arraystring.runningsum;

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */


public class RunningSum {

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i =0; i < nums.length; i++) {
            if (i != 0) {
                ans[i] = ans[i-1] + nums[i];
            } else {
                ans[i] = nums[i];
            }
        }
        return ans;
    }

    public static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }


}
