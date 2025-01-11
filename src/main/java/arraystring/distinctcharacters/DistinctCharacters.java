package arraystring.distinctcharacters;

/*
#1876
Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctCharacters {

    public static int countGoodSubstrings(String s) {
        List<String> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        list.add(s.substring(0, 3));
        for (int i = 3; i < s.length(); i++) {

        }





        return 1;
    }


}
