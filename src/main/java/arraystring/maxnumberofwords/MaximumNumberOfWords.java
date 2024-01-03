package arraystring.maxnumberofwords;

public class MaximumNumberOfWords {

    /*
    A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
    You are given an array of strings sentences, where each sentences[i] represents a single sentence.
    Return the maximum number of words that appear in a single sentence.
     */

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = sentences[i].split(" ").length;
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
