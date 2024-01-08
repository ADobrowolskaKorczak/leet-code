package arraystring.reversewords;

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */

public class ReverseWordsInString {
    public static String reverseWords1(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            for (int j = s1[i].length() - 1; j >= 0; j--) {
                sb.append(s1[i].charAt(j));
            }
            if (i < s1.length - 1)
                sb.append(' ');
        }
        return sb.toString();
    }
}
