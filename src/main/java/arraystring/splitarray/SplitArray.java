package arraystring.splitarray;

/*
#2270
Input: nums = [10,4,-8,7]
Output: 2
Explanation:
There are three ways of splitting nums into two non-empty parts:
- Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 >= 3, i = 0 is a valid split.
- Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 >= -1, i = 1 is a valid split.
- Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 < 7, i = 2 is not a valid split.
Thus, the number of valid splits in nums is 2.
 */


public class SplitArray {

    public static int waysToSplitArray(int[] nums) {
        int k = 0;
        long leftSum = 0;
        long rightSum = 0;
        long sum = 0;
        for (int n : nums) {
            sum += n;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum = sum - leftSum;
            if (leftSum >= rightSum) {
                k++;
            }
        }
        return k;
    }

}
