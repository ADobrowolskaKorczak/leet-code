package arraystring.sortpeople;

import java.util.*;
import java.util.stream.Stream;

public class SortThePeople {

    /*
    You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
    For each index i, names[i] and heights[i] denote the name and height of the ith person.
    Return names sorted in descending order by the people's heights.
     */

    public static String[] sortPeople1(String[] names, int[] heights) {
        String[] array = new String[names.length];
        Map<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < names.length; i++) {
            sortedMap.put(heights[i], names[i]);
        }
        System.out.println(sortedMap);
        return sortedMap.values().toArray(new String[0]);
    }




}
