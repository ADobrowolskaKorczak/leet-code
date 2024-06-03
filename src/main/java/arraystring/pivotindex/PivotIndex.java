package arraystring.pivotindex;

/*
#724
Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.
 */


public class PivotIndex {

    public static int pivotIndex(int[] nums) {
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
}
