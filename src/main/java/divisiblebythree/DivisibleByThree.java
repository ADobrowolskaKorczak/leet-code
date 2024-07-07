package divisiblebythree;

/*
#3190
Input: nums = [1,2,3,4]
Output: 3
Explanation:
All array elements can be made divisible by 3 using 3 operations:
Subtract 1 from 1.
Add 1 to 2.
Subtract 1 from 4.
 */

public class DivisibleByThree {

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0) {
                if (Math.round((float)nums[i]/3) == 0) {
                    count++;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}


