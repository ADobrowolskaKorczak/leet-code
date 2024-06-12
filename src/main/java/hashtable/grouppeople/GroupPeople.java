package hashtable.grouppeople;

/*
#1282
There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID
from 0 to n - 1.

You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in.
For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

Return a list of groups such that each person i is in a group of size groupSizes[i].

Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers,
return any of them. It is guaranteed that there will be at least one valid solution for the given input.

Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation:
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupPeople {

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (!map.containsKey(groupSizes[i])) {
                map.put(groupSizes[i], new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }
        for (Integer k : map.keySet()) {
            int idx = 0;
            ArrayList<Integer> valueList = map.get(k);
            int numberOfLists = valueList.size() / k;
            for (int i = 0; i < numberOfLists; i++) {
                List<Integer> innerList = new ArrayList<>();
                for (int j = 0; j < k; j++) {
                    while(innerList.size() != k) {
                        innerList.add(map.get(k).get(idx++));
                    }
                }
                list.add(innerList);
            }
        }
        return list;
    }
    


}
