package arraystring.reversevowels;

/*
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 */


public class ReverseVowels {

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s1 = new StringBuilder();
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
            || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
            || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E'
                    || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                s1.append(sb.charAt(j++));
            } else {
                s1.append(s.charAt(i));
            }
        }
        return s1.toString();
    }

}
