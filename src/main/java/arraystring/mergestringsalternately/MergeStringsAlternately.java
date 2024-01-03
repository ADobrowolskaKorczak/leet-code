package arraystring.mergestringsalternately;

public class MergeStringsAlternately {

    /*
    You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
    starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
     */

    public static String mergeAlternately1(String word1, String word2) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                newWord.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                newWord.append(word2.charAt(i));
            }
        }
        return newWord.toString();
    }

    public static String mergeAlternately2(String word1, String word2) {
        String newWord = "";
        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                newWord += word1.charAt(i);
            }
            if (i < word2.length()) {
                newWord += word2.charAt(i);
            }
        }
        return newWord;
    }
}
