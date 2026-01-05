package arraystring.reverseprexifofword;

public class ReversePrefixOfWord {

    /*
    Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at
    the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at
    3 (inclusive). The resulting string will be "dcbaefd".
    Return the resulting string.
    Example 1:
Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
     */

    public static String reversePrefix(String word, char ch) {
        String ans = "";
        int idx = word.indexOf(ch);
        for (int i = idx; i >= 0; i--) {
            ans = ans + word.charAt(i);
        }
        for (int i = idx + 1; i < word.length(); i++) {
            ans = ans + word.charAt(i);
        }
        return ans;
    }

    public static String reversePrefix2(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int idx = word.indexOf(ch);
        for (int i = idx; i >= 0; i--) {
            ans.append(word.charAt(i));
        }
        for (int i = idx + 1; i < word.length(); i++) {
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }





}
