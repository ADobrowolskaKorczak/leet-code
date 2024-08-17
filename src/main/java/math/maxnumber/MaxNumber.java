package math.maxnumber;

/*
#1323
You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 */

public class MaxNumber {

    public static int maximum69Number (int num) {
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        int count = 0;
    for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (str.charAt(i) == '9') {
                sb.append('9');
            } else if (str.charAt(i) == '6' && count == 0){
               sb.append('9');
               count++;
            } else {
                sb.append('6');
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static int maximum69Number2 (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (sb.charAt(i) == '9') {
                continue;
            } else {
                sb.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static int maximum69Number3 (int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (sb.charAt(i) == '6') {
                sb.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(sb.toString());
    }


}
