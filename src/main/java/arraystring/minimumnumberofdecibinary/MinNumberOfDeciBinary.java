package arraystring.minimumnumberofdecibinary;

/*
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinNumberOfDeciBinary {

    public static int minPartitions1(String n) {
        char[] chars = n.toCharArray();
        List<Integer> integerList = new ArrayList<>();
        for (char x : chars) {
            integerList.add(Character.getNumericValue(x));
        }
        return integerList.stream()
                .max(Comparator.comparing(Integer::intValue)).orElseThrow();
    }

    public static int minPartitions2(String n) {
        char[] chars = n.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            int num = Character.getNumericValue(chars[i]);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }





}
