package arraystring.timetocollectgarbage;

/*
#2391
Input: garbage = ["G","P","GP","GG"], travel = [2,4,3]
Output: 21
Explanation:
The paper garbage truck:
1. Travels from house 0 to house 1
2. Collects the paper garbage at house 1
3. Travels from house 1 to house 2
4. Collects the paper garbage at house 2
Altogether, it takes 8 minutes to pick up all the paper garbage.
The glass garbage truck:
1. Collects the glass garbage at house 0
2. Travels from house 0 to house 1
3. Travels from house 1 to house 2
4. Collects the glass garbage at house 2
5. Travels from house 2 to house 3
6. Collects the glass garbage at house 3
Altogether, it takes 13 minutes to pick up all the glass garbage.
Since there is no metal garbage, we do not need to consider the metal garbage truck.
Therefore, it takes a total of 8 + 13 = 21 minutes to collect all the garbage.
 */

public class TimeToCollectGarbage {

    public static int garbageCollection(String[] garbage, int[] travel) {
        int sumPaper = 0;
        int roadPaper = 0;
        int sumMetal = 0;
        int roadMetal = 0;
        int sumGlass = 0;
        int roadGlass = 0;
        for (int i = garbage.length - 1; i >= 0 ; i--) {
            //Paper
            if (garbage[i].contains("P")) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'P') {
                        sumPaper += 1;
                    }
                }
                if (roadPaper == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        roadPaper += travel[k];
                    }
                }
            }

            //Metal
            if (garbage[i].contains("M")) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'M') {
                        sumMetal += 1;
                    }
                }
                if (roadMetal == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        roadMetal += travel[k];
                    }
                }
            }

            //Glass
            if (garbage[i].contains("G")) {
                for (int j = 0; j < garbage[i].length(); j++) {
                    if (garbage[i].charAt(j) == 'G') {
                        sumGlass += 1;
                    }
                }
                if (roadGlass == 0) {
                    for (int k = i - 1; k >= 0; k--) {
                        roadGlass += travel[k];
                    }
                }
            }
        }
            return sumPaper + roadPaper + sumMetal + roadMetal + sumGlass + roadGlass;
    }

}
