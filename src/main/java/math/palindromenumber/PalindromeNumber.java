package math.palindromenumber;

public class PalindromeNumber {

    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.
     */

    public static boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s1);
        if (s1.equals(sb.reverse().toString())) {
            return true;
        } else {
            return false;
        }
    }
}
