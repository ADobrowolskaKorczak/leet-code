package arraystring.maxsubstringswithdistinctstart;

/*
You are given a string s consisting of lowercase English letters.
Return an integer denoting the maximum number of substrings you can split s into such that each substring starts
with a distinct character (i.e., no two substrings start with the same character).
Example 1:
Input: s = "abab"
Output: 2
Explanation:
Split "abab" into "a" and "bab".
Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the answer is 2.
 */



import java.util.HashSet;
import java.util.Set;

public class MaxSubstringsWithDistinctStart {

    public static int maxDistinct(String s) {
        Set<Character> chars = new HashSet<>();
        int idx = 0;
        while (idx < s.length()) {
            chars.add(s.charAt(idx++));

        }
        return chars.size();
    }

    public static int maxDistinct2(String s) {
        Set<Character> chars = new HashSet<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        return chars.size();
    }

    public static int maxDistinct3(String s) {
        return (int) s.chars().distinct().count();
    }


}
