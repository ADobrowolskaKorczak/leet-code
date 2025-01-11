package widestverticalarea;

/*
#1637
Ex:
Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
Output: 3

1, 1, 3, 5, 8, 9
 */

import java.util.Arrays;
import java.util.Comparator;

public class WidestVerticalArea {

    public static int maxWidthOfVerticalArea(int[][] points) {
        int w = 0;
        int pl = points.length;;
        int [] arr = new int[pl];
        for (int i = 0; i < pl; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int curr = 0;
        for (int i = pl - 1; i > 0; i--) {
            curr = arr[i] - arr[i-1];
            if (curr > w) {
                w = curr;
            }
        }
        return w;
    }

    public static int maxWidthOfVerticalArea2(int[][] points) {
        int max_w = 0;
        int w = 0;
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < points.length; i++) {
            w = points[i][0] - points[i-1][0];
            max_w = Math.max(max_w, w);
        }
        return max_w;
    }

}
