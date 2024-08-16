package math.distinctintegers;

/*
#2442
Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10,
after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
 */

import java.util.HashSet;
import java.util.Set;

public class DistinctIntegers {

    public static int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add((nums[i]));
        }
        for (int i = 0; i < nums.length; i++) {
            int remainder = 0;
            int rev = 0;
            while (nums[i] > 0) {
                remainder = nums[i] % 10;
                rev = (rev * 10) + remainder;
                nums[i] /= 10;
            }
            set.add(rev);
        }
        return set.size();
    }
    public static int countDistinctIntegers2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add((nums[i]));
            int remainder = 0;
            int rev = 0;
            while (nums[i] > 0) {
                remainder = nums[i] % 10;
                rev = (rev * 10) + remainder;
                nums[i] /= 10;
            }
            set.add(rev);
        }
        return set.size();
    }




}
