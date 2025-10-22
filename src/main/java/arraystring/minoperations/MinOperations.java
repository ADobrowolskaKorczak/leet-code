package arraystring.minoperations;

/*
You are given an integer array nums and an integer k. You can perform the following operation any number of times:
Select an index i and replace nums[i] with nums[i] - 1.
Return the minimum number of operations required to make the sum of the array divisible by k.
Example 1:
Input: nums = [3,9,7], k = 5
Output: 4
Explanation:
Perform 4 operations on nums[1] = 9. Now, nums = [3, 5, 7].
The sum is 15, which is divisible by 5.
 */

public class MinOperations {
    public static int minOperations(int[] nums, int k) {
        int op = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        while(sum % k != 0) {
          sum--;
          op++;
        }
        return op;
    }

    public static int minOperations2(int[] nums, int k) {
        int op = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum % k;
    }


}
