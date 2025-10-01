package arraystring.reversedegreestring;


public class ReverseDegreeOfString {

    public static int reverseDegree(String s) {
        int ret = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = ('z' - s.charAt(i) + 1)*(i+1);
        }
        for (int i = 0; i < s.length(); i++) {
            ret += arr[i];
        }
        return ret;
    }


}
