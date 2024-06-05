package arraystring.permutationdifference;

/*
You are given two strings s and t such that every character occurs at most once in s and t is a permutation of s.

The permutation difference between s and t is defined as the sum of the absolute difference between the index of the
occurrence of each character in s and the index of the occurrence of the same character in t.

Return the permutation difference between s and t.
"abcde"
"edbac"
 */

import java.util.HashMap;
import java.util.Map;

public class PermutationDifference {

    public static int findPermutationDifference(String s, String t) {
        int absSum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < t.length(); i++) {
            absSum += Math.abs(i - map.get(t.charAt(i)));
        }
        return absSum;
    }


}
