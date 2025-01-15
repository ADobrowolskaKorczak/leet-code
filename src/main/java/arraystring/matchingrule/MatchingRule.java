package arraystring.matchingrule;


/*
#1773
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and
["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
items[i] = [typei, colori, namei]
 */

import java.util.List;

public class MatchingRule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        if (ruleKey.equals("type")) {
            for (int i = 0; i < items.size(); i++) {
                if ((items.get(i).get(0)).equals(ruleValue)) {
                    count++;
                }
            }
        } else if(ruleKey.equals("color")) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            }
        } else {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && (items.get(i).get(0)).equals(ruleValue)) count++;
            if (ruleKey.equals("color") && (items.get(i).get(1)).equals(ruleValue)) count++;
            if (ruleKey.equals("name") && (items.get(i).get(2)).equals(ruleValue)) count++;
        }
        return count;
    }


}
