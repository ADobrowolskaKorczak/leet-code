package arraystring.addstrings;

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
You must also not convert the inputs to integers directly.
 */

public class AddStrings {

    public static String addStrings(String num1, String num2) {
        int int1 = Integer.parseInt(num1);
        int int2 = Integer.parseInt(num2);
        return String.valueOf(int1+int2);

    }

}
