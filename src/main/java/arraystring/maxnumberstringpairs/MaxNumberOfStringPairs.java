package arraystring.maxnumberstringpairs;

/*
You are given a 0-indexed array words consisting of distinct strings.

The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.
 */

public class MaxNumberOfStringPairs {

    public static int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && (words[i].equals(words[j]) || words[i].equals((new StringBuilder(words[j]).reverse()).toString()))) {
                    count++;
                }
            }
        }
        return count/2;
    }


}
