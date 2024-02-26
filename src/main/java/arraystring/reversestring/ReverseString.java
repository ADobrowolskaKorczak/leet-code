package arraystring.reversestring;

/*
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 */

public class ReverseString {

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        for (char c : s) {
            System.out.print(c + " ");
        }

    }
}
