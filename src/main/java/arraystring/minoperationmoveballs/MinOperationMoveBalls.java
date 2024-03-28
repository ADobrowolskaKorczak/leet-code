package arraystring.minoperationmoveballs;

/*
You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty,
and '1' if it contains one ball.
In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
Note that after doing so, there may be more than one ball in some boxes.
Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls
to the ith box.
Each answer[i] is calculated considering the initial state of the boxes.

Input: boxes = "110"
Output: [1,1,3]

 */


public class MinOperationMoveBalls {

    public static int[] minOperations(String boxes) {
        char[] chars = boxes.toCharArray();
        int[] minOperations = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (i != j && chars[j] == '1') {
                    if (i < j) {
                        count = count + j - i;
                    } else {
                        count = count + i - j;
                    }
                }
                minOperations[i] = count;
            }
        }
        return minOperations;
    }

}
