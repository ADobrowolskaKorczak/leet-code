package arraystring.nestingdepth;

/*
Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested
parentheses.

Example 1:
Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3
Explanation:
Digit 8 is inside of 3 nested parentheses in the string.
 */

import java.util.TreeSet;

public class NestingDepthOfParentheses {

    public static int maxDepth(String s) {
        int out = 0;
        TreeSet<Integer> coll = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                out++;
            } else if (s.charAt(i) == ')') {
                out--;
            }
            coll.add(out);
        }
        return coll.last();
    }


}
