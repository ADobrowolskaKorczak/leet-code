package arraystring.wordpattern;

/*
#290
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".


Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        boolean flag = true;
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        } else {
            for (int i = 0; i < pattern.length(); i++) {
                if (!map.containsKey(pattern.charAt(i)) && !map.containsValue(words[i])) {
                    map.put(pattern.charAt(i), words[i]);
                } else {
                    if (!words[i].equals(map.get(pattern.charAt(i)))) {
                        return false;
                    }
                }

            }
        }
        return flag;
    }


}
