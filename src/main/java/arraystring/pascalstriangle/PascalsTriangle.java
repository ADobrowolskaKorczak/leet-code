package arraystring.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/*
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = pascalTriangle.get(i - 1);
                    int value = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(value);
                }
            }
            pascalTriangle.add(row);
        }
    return pascalTriangle;
    }

}
