package arraystring.truncatesentence;

/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
*/


public class TruncateSentence {

    public static String truncateSentence1(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(words[i]);
            if (i != k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }


}
