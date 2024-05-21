package arraystring.arrayconditions;

/*
Input: nums = [1,3,4,1,2,3,1]
Output: [[1,3,4,2],[1,3],[1]]
Explanation: We can create a 2D array that contains the following rows:
- 1,3,4,2
- 1,3
- 1
All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
It can be shown that we cannot have less than 3 rows in a valid array.
 */


import java.util.ArrayList;
import java.util.List;

public class ArrayConditions {

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        ans.add(list);
        outer: for (int i = 0; i < nums.length; i++) {
            for (List<Integer> part : ans) {
                if (!part.contains(nums[i])) {
                    part.add(nums[i]);
                    continue outer;
                }
            }
            List<Integer> newPart = new ArrayList<>();
            newPart.add(nums[i]);
            ans.add(newPart);
        }
        return ans;
    }
}



