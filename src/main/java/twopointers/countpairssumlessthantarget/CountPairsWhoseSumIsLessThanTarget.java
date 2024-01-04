package twopointers.countpairssumlessthantarget;
import java.util.List;
/*
Given a 0-indexed integer array nums of length n and an integer target,
return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
 */

public class CountPairsWhoseSumIsLessThanTarget {

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i < j && nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
