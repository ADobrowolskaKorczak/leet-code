package math.countnumbers;

/*
#2520
Given an integer num, return the number of digits in num that divide num.

An integer val divides nums if nums % val == 0.
 */

public class CountNumbers {
    public static int countDigits(int num) {
        int count = 0;
        int number = num;
        while(num > 0) {
            int rem = num % 10;
            if (number % rem == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }


}
