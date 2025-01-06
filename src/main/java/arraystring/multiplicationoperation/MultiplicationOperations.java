package arraystring.multiplicationoperation;

/*
#3264
Input: nums = [2,1,3,5,6], k = 5, multiplier = 2
Output: [8,4,6,5,6]
 */

public class MultiplicationOperations {

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        int minIdx = 0;
        int min = 0;
            for (int i = 0; i < k; i++) {
                minIdx = 0;
                min = nums[minIdx];
                for (int j = 0; j < nums.length; j++) {
                         if (nums[j] < min) {
                             min = nums[j];
                             minIdx = j;
                         }
                }
                nums[minIdx] *= multiplier;
            }
        return nums;
    }

}
