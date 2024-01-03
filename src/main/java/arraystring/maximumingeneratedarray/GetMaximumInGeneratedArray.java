package arraystring.maximumingeneratedarray;

public class GetMaximumInGeneratedArray {

    /*
    You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
    nums[0] = 0
    nums[1] = 1
    nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    Return the maximum integer in the array nums.
     */

    public static int getMaximumGenerated1(int n) {
        int[] nums = new int[n + 1];
        int a = 1;
        int b = 2;
        int c = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = 0;
            } else if (i == 1) {
                nums[i] = 1;
            } else {
                if ((i % 2) != 0) {
                    nums[i] = nums[i - b] + nums[i - c];
                    b++;
                    c++;
                } else {
                    nums[i] = nums[i - a];
                    a++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println("Max: " + max);
        return max;
    }

    public static int getMaximumGenerated2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 0;
        for (int i = 2; i < nums.length; i++) {
            if ((i % 2) == 0) {
                nums[i] = nums[i/2];
            } else {
                nums[i] = nums[i/2] + nums[i/2 + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

}



