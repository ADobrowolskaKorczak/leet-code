package math.countoddnumbers;

public class CountOddNumbers {

    /*
    Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
     */

    public static int countOdds(int low, int high) {
        if (low%2 != 0 && high%2 != 0) {
            return (high-low+1)/2 + 1;
        } else {
            return (high-low+1)/2;
        }
    }
}
