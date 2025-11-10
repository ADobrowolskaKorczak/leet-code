package arraystring.restorefinishingorder;

/*
You are given an integer array order of length n and an integer array friends.
order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their
finishing order.
friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is
guaranteed to appear in the order array.
Return an array containing your friends' IDs in their finishing order.

Example 1:
Input: order = [3,1,2,5,4], friends = [1,3,4]
Output: [3,1,4]
Explanation:
The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].
 */

import java.util.ArrayList;
import java.util.List;

public class RestoreFinishingOrder {
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int x = 0;
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (order[i] == friends[j]) {
                    ans[x++] = order[i];
                }
            }
        }
        return ans;
    }

    public static int[] recoverOrder2(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int idx = 0;
        List<Integer> friendsList = new ArrayList<>();
        for (int i = 0 ; i < friends.length; i++) {
            friendsList.add(friends[i]);
        }
       for (int i = 0; i < order.length; i++) {
           if (friendsList.contains(order[i])) {
               ans[idx++] = order[i];
           }
       }
        return ans;
    }

}
