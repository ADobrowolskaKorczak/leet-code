package arraystring.maxaveragesumarray;

/*
#643
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any
answer with a calculation error less than 10-5 will be accepted.
 */


public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        int max_sum = 0;
        int n = nums.length;
        int len;
        if (n < k) {
            len = k;
            for (int i = 0; i < len; i++) {
                max_sum += nums[i];
            }
        } else {
            len = n;
            for (int i = 0; i < k; i++) {
                max_sum += nums[i];
            }
            int current_sum = max_sum;
            for (int i = k; i < len; i++) {
                current_sum += nums[i] - nums[i-k];
                max_sum = Integer.max(max_sum, current_sum);
            }
        }
        return (double) max_sum/k;
    }


}
