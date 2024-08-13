package math.pivotinteger;

/*
Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one
pivot index for the given input.
 */

public class PivotInteger {

    public static int pivotInteger(int n) {
        int[] arr = new int[n];
        int sumL = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sumL += arr[i];
            int sumR = sum - sumL + arr[i];
            if (sumL == sumR) {
                return arr[i];
            }
        }
        return -1;
    }

}
