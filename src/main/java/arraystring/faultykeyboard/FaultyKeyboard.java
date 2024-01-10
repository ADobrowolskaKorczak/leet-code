package arraystring.faultykeyboard;
/*
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.
 */

public class FaultyKeyboard {

    public static String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'i') {
                sb.append(s.charAt(i));
            } else {
                sb.reverse();
            }
        }
        return sb.toString();
    }

}
