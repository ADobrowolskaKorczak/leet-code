package arraystring.arthmeticprogression;

import java.util.Arrays;

public class ArithmeticProgression {

    /*
    A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
    Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
     */

    public static boolean canMakeArithmeticProgression1(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }

    public static boolean canMakeArithmeticProgression2(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j+1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int diff = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] != diff) {
                return false;
            }
        }
        return true;
    }
}
