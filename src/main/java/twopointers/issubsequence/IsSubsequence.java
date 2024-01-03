package twopointers.issubsequence;

public class IsSubsequence {

    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
    of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */

//    String s = "ba";
//    String t = "baab";

    public static boolean isSubsequence1(String s, String t) {

//NIEPEŁNE ROZWIAZANIE
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tArray.length; i++) {
            for (int j = 0; j< sArray.length; j++) {
                if (tArray[i] == sArray[j]) {
                    if (!sb.toString().isEmpty() && sb.toString().indexOf(sArray[j]) != -1){
                        continue;
                    } else {
                        sb.append(sArray[j]);
                    }
                }
            }
        }
        System.out.println(sb);
        System.out.println(s);
        if (sb.toString().equals(s)) {
            return true;
        } else {
            return false;
        }
    }

//
//    String a = "aa";
//    String b = "acfb";

    public static boolean isSubsequence2(String s, String t) {

        /*Returns true if s1 is subsequence of s2*/
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }
        /*If i reaches end of s1,that mean we found all
        characters of s1 in s2,
        so s1 is subsequence of s2, else not*/
        return i == n;
    }

}
