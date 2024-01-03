package arraystring.validanagram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ValidAnagram {

    /*
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     */

    public static boolean isAnagram(String s, String t) {
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for (Character x : s.toCharArray()) {
            l1.add(x);
        }
        l1.sort(Comparator.comparing(Function.identity()));
        for (Character x : t.toCharArray()) {
            l2.add(x);
        }
        l2.sort(Comparator.comparing(Function.identity()));
        return l1.equals(l2);
    }




}
