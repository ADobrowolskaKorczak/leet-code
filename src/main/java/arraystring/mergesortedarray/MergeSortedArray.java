package arraystring.mergesortedarray;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;

        int idx = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (idx >= 0) {
                nums1[i] = nums2[idx--];
            }
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }


        for (int x : nums1) {
            System.out.print(x + " ");
        }


    }

}
