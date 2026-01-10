package arraystring.minnumberofmoves;

import java.util.Arrays;

public class MinNumberOfMoves {

    public static int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }

    public static int minMovesToSeat2(int[] seats, int[] students) {
        int ans = 0;
        int k = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        while (k < seats.length) {
            ans += Math.abs(seats[k] - students[k]);
            k++;
        }
        return ans;
    }



}
