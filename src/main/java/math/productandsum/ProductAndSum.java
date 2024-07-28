package math.productandsum;

/*
#1281
Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */

public class ProductAndSum {
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            product *= remainder;
            sum += remainder;
            n /= 10;
        }
        return product - sum;
    }
}
