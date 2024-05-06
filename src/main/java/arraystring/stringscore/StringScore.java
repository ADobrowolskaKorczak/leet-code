package arraystring.stringscore;

/*
Input: s = "hello"

Output: 13

Explanation:

The ASCII values of the characters in s are: 'h' = 104, 'e' = 101, 'l' = 108, 'o' = 111.
So, the score of s would be |104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13.
 */


public class StringScore {

    public static int scoreOfString(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            result += Math.abs(chars[i] - chars[i+1]);
        }
        return result;
    }

    public static int scoreOfString2(String s) {
        int result = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            result += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return result;
    }




}
