package arraystring.destinationcity;

/*
#1436
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo"
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip
consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

 */

import java.util.List;

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


}
