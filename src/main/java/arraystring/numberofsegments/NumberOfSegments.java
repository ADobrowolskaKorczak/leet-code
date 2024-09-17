package arraystring.numberofsegments;

public class NumberOfSegments {

    public static int countSegments(String s) {
        if (s.trim().length() == 0) {
            return 0;
        } else {
            return s.trim().split("\\s+").length;
        }
    }
}
