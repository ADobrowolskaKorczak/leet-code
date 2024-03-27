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

    public static int minPartitions(String n) {
        char[] chars = n.toCharArray();
        List<Integer> integerList = new ArrayList<>();
        for (char x : chars) {
            integerList.add(Character.getNumericValue(x));
        }
        return integerList.stream()
                .max(Comparator.comparing(Integer::intValue)).orElseThrow();
    }



}
