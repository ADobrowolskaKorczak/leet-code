package arraystring.containsduplicate;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        boolean b = false;
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Long i : map.values()) {
            if (i >= 2) {
                b = true;
            }
        }
        return b;
    }
}
