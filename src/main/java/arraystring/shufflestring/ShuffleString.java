package arraystring.shufflestring;

/*
#1528
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that
the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
Example:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */


public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }


}
