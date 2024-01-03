package arraystring.movezeroes;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroes {

    /*
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Note that you must do this in-place without making a copy of the array.
     */

    public static void moveZeroes1(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        list1.addAll(list2);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list1.get(i);
        }
    }

    public static void moveZeroes2(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}





