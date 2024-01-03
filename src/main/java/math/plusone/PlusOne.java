package math.plusone;

public class PlusOne {

    /*
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
     */

    public static int[] plusOne1(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }
        System.out.println(sb);
        long x = Long.parseLong(sb.toString()) + 1;
        char[] chars = String.valueOf(x).toCharArray();
        int[] array = new int[chars.length];
        for (int j = 0; j < array.length; j++) {
            array[j] = Character.getNumericValue(chars[j]);
        }
        return array;
    }


    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
