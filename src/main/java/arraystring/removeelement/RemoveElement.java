package arraystring.removeelement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
1. Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
   The remaining elements of nums are not important as well as the size of nums.
2. Return k.
 */


    public static int removeElement1(int[] nums, int val) {

        int[] newArray = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newArray[k++] = nums[i];
            }
        }

        for (int j = 0; j < k; j++) {
            nums[j] = newArray[j];
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

        return k;
    }

    public static int removeElement2(int[] nums, int val) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.removeIf(x -> x.compareTo(val) == 0);
        for (int k = 0; k < nums.length; k++) {
            if (list.size() > k) {
                nums[k] = list.get(k);
            }
        }

        for (int x : nums) {
            System.out.print(x + " ");
        }

        return list.size();
    }


    public static int removeElement3(int[] nums, int val) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        list.removeIf(x -> x == val);
        for (int k = 0; k < list.size(); k++) {
                nums[k] = list.get(k);

        }

        return list.size();

    }

}








