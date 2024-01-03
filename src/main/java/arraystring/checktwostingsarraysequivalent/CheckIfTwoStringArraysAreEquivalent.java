package arraystring.checktwostingsarraysequivalent;

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.
 */


public class CheckIfTwoStringArraysAreEquivalent {

    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (int i = 0; i < word1.length; i++) {
            a += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            b += word2[i];
        }
        return a.equals(b);
    }



}
