package arraystring.shufflearray;

/*
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */

import java.util.ArrayList;
import java.util.List;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int y = 0;
        for (int i = 0; i < n; i++) {
            ans[y++] = nums[i];
            ans[y++] = nums[n + i];
        }
        return ans;
    }

    public static int[] shuffle2(int[] nums, int n) {
        List<Integer> ansList = new ArrayList<>();
        int[] ans = new int[2 * n];
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];
        for (int i = 0; i < n; i++) {
            firstArray[i] = nums[i];
            secondArray[i] = nums[n + i];
        }
        for (int i = 0; i < n; i++) {
            ansList.add(firstArray[i]);
            ansList.add(secondArray[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }

}
