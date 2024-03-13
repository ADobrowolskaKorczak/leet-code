package twopointers.palindromicstring;

/*
Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
 */

//{"abc","car","ada","racecar","cool"};

import java.util.ArrayList;
import java.util.List;

public class FindFirstPalindromicString {

    public static String firstPalindrome(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            String string = sb.append(words[i]).reverse().toString();
            if (string.equals(words[i])) {
                result = words[i];
                break;
            }
        }
        return result;
    }
}
