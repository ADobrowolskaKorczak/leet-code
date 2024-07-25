package math.smallestevenmultiple;

/*
#2413
Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
Example 1:
Input: n = 5
Output: 10
Explanation: The smallest multiple of both 5 and 2 is 10.
 */

public class SmallestEvenMultiple {
    public static int smallestEvenMultiple(int n) {
        if (n % 2 != 0) {
            return n * 2;
        }
        return n;
    }
}
