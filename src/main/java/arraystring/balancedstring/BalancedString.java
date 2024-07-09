package arraystring.balancedstring;

/*
#1221
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */

public class BalancedString {

    public static int balancedStringSplit(String s) {
        int count = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                flag++;
             else
                flag--;

            if (flag == 0) count++;
        }
        return count;
    }

}
