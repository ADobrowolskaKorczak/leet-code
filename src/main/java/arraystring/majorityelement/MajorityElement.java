package arraystring.majorityelement;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {

    /*
    Given an array nums of size n, return the majority element.

    The majority element is the element that appears more than [n / 2] times. You may assume that the majority element always exists in the array.
     */

    public static int majorityElement1(int[] nums) {

        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Integer key = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get().getKey();

        System.out.println(key);
        return key;
    }


    public static int majorityElement2(int[] nums) {
        int maxCount = 0;
        int elementMaxFreq = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                elementMaxFreq = nums[i];
            }
        }

        System.out.println(elementMaxFreq);
        return elementMaxFreq;
    }
}
