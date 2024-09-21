package arraystring.rotatearray;

/*
#189
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
1,2
k=1 2,1
k=2 1,2
k=3 2,1
 */

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int temp = 0;
        int counter = 0;
        int n = nums.length - 1;
        for (int a = 0; a < k; a++) {
            for (int i = nums.length-1; i >= 0; i--) {
                temp = nums[n];
                if (counter != k) {
                    for (int j = nums.length-1; j > 0; j--) {
                        nums[j] = nums[j-1];
                    }
                    nums[0] = temp;
                    counter++;
                }
            }
        }
    }

    public static void rotate2(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
