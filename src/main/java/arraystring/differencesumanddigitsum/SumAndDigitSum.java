package arraystring.differencesumanddigitsum;

/*
Input: nums = [1,15,6,3]
Output: 9
Explanation:
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 */

public class SumAndDigitSum {

    public static int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (nums[i] > 0) {
                digitSum += nums[i] % 10;
                nums[i] = nums[i] / 10;
            }
        }
        return Math.abs((sum - digitSum));
    }


}
