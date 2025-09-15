package arraystring.partitionarray;

/*
You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions
are satisfied:
Every element less than pivot appears before every element greater than pivot.
Every element equal to pivot appears in between the elements less than and greater than pivot.
The relative order of the elements less than pivot and the elements greater than pivot is maintained.
More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the
jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.

Example:
Input: nums = [9,12,5,10,14,3,10], pivot = 10
Output: [9,5,3,10,10,12,14]
Explanation:
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are
the respective orderings.
 */


import java.util.ArrayList;
import java.util.List;

public class PartitionArray {

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> more = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                less.add(nums[i]);
            } else if (nums[i] > pivot) {
                more.add(nums[i]);
            } else {
                equal.add(nums[i]);
            }
        }
        int i = 0;
            for (int j = 0; j < less.size(); j++) {
                ans[i] = less.get(j);
                i++;
            }
            for (int k = 0; k < equal.size(); k++) {
                ans[i] = equal.get(k);
                i++;
            }
            for (int n = 0; n < more.size(); n++) {
                ans[i] = more.get(n);
                i++;
            }
        return ans;
    }

    public static int[] pivotArray2(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] < pivot) {
                ans[i] = nums[j];
                i++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == pivot) {
                ans[i] = nums[k];
                i++;
            }
        }
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] > pivot) {
                ans[i] = nums[n];
                i++;
            }
        }
        return ans;
    }



}
