package math.harshadnumber;

/*
#3099
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return
the sum of the digits of x if x is a Harshad number, otherwise, return -1.
 */


public class HarshadNumber {
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        if (x % sum == 0) {
            return sum;
        } else {
            return -1;
        }

    }

}
