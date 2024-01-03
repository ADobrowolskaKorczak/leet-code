package arraystring.findindex;

public class FindIndexOfFirstString {

    /*
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */

    public static int strStr(String haystack, String needle) {

        if (haystack.contains(needle)) {
            int i = haystack.indexOf(needle);
            return i;
        } else {
            return -1;
        }
    }


}
