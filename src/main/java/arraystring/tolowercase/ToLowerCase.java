package arraystring.tolowercase;

import java.util.Arrays;

public class ToLowerCase {

    /*
    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
     */

    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        int d = 'a' - 'A';
        for (int i = 0; i < s.length(); i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] + d);
            }
        }
        return String.valueOf(chars);
    }



}
