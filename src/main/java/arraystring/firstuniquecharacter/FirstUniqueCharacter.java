package arraystring.firstuniquecharacter;

/*
#387
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1:
Input: s = "leetcode"
Output: 0
Explanation:
The character 'l' at index 0 is the first character that does not occur at any other index.
 */

public class FirstUniqueCharacter {

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    break;
                }
                if (j == s.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }

}
