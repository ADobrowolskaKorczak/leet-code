package hashtable.findcommonelementsbetweentwoarrays;

/*
You are given two 0-indexed integer arrays nums1 and nums2 of sizes n and m, respectively.
Consider calculating the following values:
The number of indices i such that 0 <= i < n and nums1[i] occurs at least once in nums2.
The number of indices i such that 0 <= i < m and nums2[i] occurs at least once in nums1.
Return an integer array answer of size 2 containing the two values in the above order.
 */

import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] answer = new int[2];
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int count1 = 0;
        int count2 = 0;

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (set2.contains(nums1[i])) {
                count1++;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                count2++;
            }
        }

        answer[0] = count1;
        answer[1] = count2;
        return answer;
    }



}
