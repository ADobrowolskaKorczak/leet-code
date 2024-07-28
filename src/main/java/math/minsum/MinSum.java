package math.minsum;

/*
#2160
Input: num = 2932
Output: 52
Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
 */

import java.util.Arrays;

public class MinSum {
    public static int minimumSum(int num) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(array);
        return array[0]*10 + array[1]*10 + array[2] + array[3];
    }

}
