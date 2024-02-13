package arraystring.sortingthesentence;

/*
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
 */


import java.util.ArrayList;
import java.util.List;

public class SortingTheSentence {

    public static String sortSentence(String s) {

        String[] s1 = s.split(" ");
        String[] words1 = new String[s1.length];
        for (int i = 0; i < s1.length; i++) {
            int x = Integer.parseInt(String.valueOf(s1[i].charAt(s1[i].length() - 1)));
            words1[x-1] = s1[i].substring(0, s1[i].length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            if (i != s1.length - 1) {
                sb.append(words1[i] + " ");
            } else {
                sb.append(words1[i]);
            }
        }
        return sb.toString();

    }


}
