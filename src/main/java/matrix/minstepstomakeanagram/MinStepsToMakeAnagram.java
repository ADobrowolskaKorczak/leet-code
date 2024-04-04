package matrix.minstepstomakeanagram;

/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.
 */

import java.util.HashMap;
import java.util.Map;


public class MinStepsToMakeAnagram {

    public static int minSteps(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        int minSteps=0;
        for(int i = 0;i<t.length();i++){
            char c=t.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            }
            else{
                minSteps++;
            }
        }
        return minSteps;
    }
}




