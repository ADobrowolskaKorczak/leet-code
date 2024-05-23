package arraystring.sumdifferences;

/*
Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */


public class SumDifferences {

    public static int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int[] leftSum = new int[nums.length];
        leftSum[0] = 0;
        int[] rightSum = new int[nums.length];
        rightSum[nums.length-1] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i+1] + nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return ans;
    }

}
