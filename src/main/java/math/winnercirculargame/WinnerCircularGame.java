package math.winnercirculargame;

/*
#1823
 */

import java.util.ArrayList;
import java.util.List;

public class WinnerCircularGame {
    public static int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        int currIdx = 0;
        int toRemove = 0;
        while (arr.size() > 1) {
            toRemove = (currIdx - 1 + k) % arr.size();
            currIdx = toRemove;
            arr.remove(toRemove);
        }
        return arr.get(0);
    }


}
