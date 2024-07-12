package arraystring.destinationcity;

/*
#1436
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip
consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        String city = paths.get(0).get(1);
        for (int i = 0; i< paths.size(); i++) {
            for (int j = 1; j < paths.size(); j++) {
                if (paths.get(j).get(0).equals(city)) {
                    city = paths.get(j).get(1);
                }
            }
        }
        return city;
    }

    public static String destCity2(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        for (List<String> c : paths) {
            map.put(c.get(0), c.get(1));
        }
        String city = paths.get(0).get(0);
        while (map.containsKey(city)) {
            city = map.get(city);
        }
        return city;
    }


}
