package arraystring.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
 */


public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean b = false;
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Long i : map.values()) {
            if (i >= 2) {
                b = true;
            }
        }
        return b;
    }

    public static boolean containsDuplicate2(int[] nums) {
        boolean b = false;
        int a = nums.length;
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if (nums.length != set.size()) {
            b = true;
        }
        return b;
    }








}
