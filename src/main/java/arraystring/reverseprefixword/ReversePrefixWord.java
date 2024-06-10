package arraystring.reverseprefixword;

/*
#2000
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends
at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at
3 (inclusive). The resulting string will be "dcbaefd".
 */


public class ReversePrefixWord {

    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int idx = word.indexOf(ch);
        if (idx != -1) {
            for (int i = idx; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(word.substring(idx+1, word.length()));
        } else {
            return word;
        }
        return sb.toString();
    }


}
