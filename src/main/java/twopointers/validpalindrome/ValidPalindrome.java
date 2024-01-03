package twopointers.validpalindrome;

import java.util.Arrays;

public class ValidPalindrome {

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
    it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.
     */

    public static boolean isPalindrome1(String s) {
        String s1 = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(s1);
        String reversedString = stringBuilder.reverse().toString();
        if (s1.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome2(String s) {
        String s1 = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        char[] chars = s1.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length-1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        String s2 = stringBuilder.toString();
        if (s1.equals(s2)) {
            return true;
        } else {
            return false;
        }

//        StringBuilder stringBuilder = new StringBuilder(s1);
//        String reversedString = stringBuilder.reverse().toString();
//        if (s1.equals(reversedString)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//        return true;


    }
}
