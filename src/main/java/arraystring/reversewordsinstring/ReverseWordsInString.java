package arraystring.reversewordsinstring;

/*
#151
Input: s = "a good   example"
Output: "example good a"
 */

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] s1 = s.trim().split("\\s+");
        String out = "";
        for (int i = s1.length-1; i >= 0; i--) {
            if (!s1[i].equals(" ")) {
                out += s1[i] + " ";
            }
        }
        return out.trim();
    }


}
