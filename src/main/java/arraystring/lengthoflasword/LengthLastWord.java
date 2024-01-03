package arraystring.lengthoflasword;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LengthLastWord {

    public static int lengthOfLastWord1(String s) {
        List<String> strings = Arrays.asList(s.split(" "));
        int length = strings.get(strings.size() - 1).length();
        return length;
    }

    public static int lengthOfLastWord2(String s) {
        String[] s1 = s.split(" ");
        String s2 = s1[s1.length - 1];
        return s2.length();
    }

    public static int lengthOfLastWord3(String s) {
        List<Character> letters = new ArrayList<>();

        int j = s.length();
        while(' ' == s.charAt(--j));

        for (int k = j; k>= 0; k--) {
            char letter = s.charAt(k);
            if (' ' == letter) {
                break;
            }
            letters.add(letter);
        }
        return letters.size();
    }




}
