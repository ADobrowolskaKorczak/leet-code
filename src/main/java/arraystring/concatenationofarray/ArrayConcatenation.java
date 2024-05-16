package arraystring.concatenationofarray;

/*
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

public class ArrayConcatenation {

    public static int[] getConcatenation(int[] nums) {
        int x = nums.length;
        int[] ans = new int[2 * x];
        for (int i = 0; i < x; i++) {
            ans[i] = nums[i];
            ans[i + x] = nums[i];
        }
        return ans;
    }


}
