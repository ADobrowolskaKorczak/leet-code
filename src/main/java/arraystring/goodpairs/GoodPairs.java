package arraystring.goodpairs;

/*
#3162
You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive
integer k.
A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
Return the total number of good pairs.
        int[] gpnum1 = {1,2,4,12};
        int[] gpnum2 = {2,4};
        int gpk = 3;
 */

public class GoodPairs {

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j]*k) == 0) {
                    count++;
                }
            }
        }
        return count;
    }


}
