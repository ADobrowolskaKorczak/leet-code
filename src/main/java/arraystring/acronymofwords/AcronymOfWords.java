package arraystring.acronymofwords;

import java.util.List;

/*
#2828
Input: words = ["alice","bob","charlie"], s = "abc"
Output: true
Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively.
Hence, s = "abc" is the acronym.
 */

public class AcronymOfWords {

    public static boolean isAcronym(List<String> words, String s) {
        boolean flag = false;
        if (s.length() != words.size()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (words.get(i).charAt(0) == s.charAt(i)) flag = true; else return false;
        }
        return flag;
    }

    public static boolean isAcronym2(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(words.get(i).charAt(0));
        }
        return s.equals(sb.toString());
    }



}
