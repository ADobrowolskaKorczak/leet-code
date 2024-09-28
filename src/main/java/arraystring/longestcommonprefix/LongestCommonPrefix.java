package arraystring.longestcommonprefix;

/*
#14
Input: strs = ["flower","flow","flight"]
Output: "fl"
 */

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder("");
       String s1 = strs[0];
       String sn = strs[strs.length-1];
       int idx = 0;
       while (idx < s1.length() && idx < sn.length()) {
           if (s1.charAt(idx) == sn.charAt(idx)) {
               sb.append(s1.charAt(idx));
               idx++;
           } else {
               break;
           }
       }
        return sb.toString();
    }

}
