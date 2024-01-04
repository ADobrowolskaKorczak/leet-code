package twopointers.countnumberoffairpairs;

import java.util.Arrays;

/*
Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.
A pair (i, j) is fair if:
    0 <= i < j < n, and
    lower <= nums[i] + nums[j] <= upper
 */
public class CountNumberOfFairPairs {

    public static long countFairPairs1(int[] nums, int lower, int upper) {
        long count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper) {
                    count++;
                }
            }
        }
        return count;
    }

    public static long countFairPairs2(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        int pointerOne = 0;
        int pointerTwo = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
        while (pointerTwo > 0 && nums[i] + nums[pointerTwo] > upper) {
            pointerTwo--;
        }
        pointerOne = i + 1;
        while (pointerOne < nums.length && nums[i] + nums[pointerOne] < lower) {
            pointerOne++;
        }
        if (pointerOne <= pointerTwo) {
            count += pointerTwo - pointerOne + 1;
        }
        }
        return count;
    }
}
