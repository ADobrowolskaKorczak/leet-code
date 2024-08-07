package math.numberofcoins;

/*
#1561
Input: piles = [2,4,1,2,7,8]
Output: 9
Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the
last one.
Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
The maximum number of coins which you can have are: 7 + 2 = 9.
On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
int[] piles = {2,4,1,2,7,8};
 */

import java.util.Arrays;

public class NumberOfCoins {

    public static int maxCoins(int[] piles) {
        int count = 0;
        Arrays.sort(piles);
        for (int i = piles.length/3; i < piles.length; i += 2) {
            count += piles[i];
        }
        return count;
    }


}
