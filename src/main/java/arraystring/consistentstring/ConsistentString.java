package arraystring.consistentstring;

/*
#1684
Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 */

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char x : allowed.toCharArray()) {
            set.add(x);
        }
        int count = 0;
        for (String x : words) {
            boolean bool = true;
            for (char c : x.toCharArray()) {
                if (!set.contains(c)) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                count++;
            }
        }
        return count;
    }
}
