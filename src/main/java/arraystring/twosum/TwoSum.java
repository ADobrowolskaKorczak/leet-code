package arraystring.twosum;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up
to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */


public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int [] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j & nums[i] + nums[j] == target) {
                    arr[0] = j;
                    arr[1] = i;
                }
            }
        }
        return arr;
    }


}
