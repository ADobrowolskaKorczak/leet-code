package arraystring.middleindex;

/*
#1991
Input: nums = [2,3,-1,8,4]
Output: 3
Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
The sum of the numbers after index 3 is: 4 = 4
 */


public class MiddleIndex {

    public static int findMiddleIndex(int[] nums) {
        int idx = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                rightSum += nums[j];

            }
            if (leftSum == rightSum) {
                return i;
            } else {
                idx = -1;
            }
            leftSum += nums[i];
            rightSum = 0;
        }
        return idx;
    }

    public static int findMiddleIndex2(int[] nums) {
        int idx = -1;
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum += nums[i-1];
            }
            rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            } else {
                idx = -1;
            }

        }
        return idx;
    }


}
