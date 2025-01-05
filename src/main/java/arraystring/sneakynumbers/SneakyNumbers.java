package arraystring.sneakynumbers;

/*
#
In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number
was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time,
making the list longer than usual.
As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing
the two numbers (in any order), so peace can return to Digitville.
Input: nums = [0,0,1,1]
Output: [0,1]
 */


public class SneakyNumbers {

    public static int[] getSneakyNumbers(int[] nums) {
        int[] ansArr = new int[2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j] && k < 2) {
                    ansArr[k] = nums[i];
                    k++;
                }
            }
        }
        return ansArr;
    }


}
