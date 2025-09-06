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
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Long i : map.values()) {
            if (i >= 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        int a = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }

    public static boolean containsDuplicate3(int[] nums) {
        int a = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }









}
