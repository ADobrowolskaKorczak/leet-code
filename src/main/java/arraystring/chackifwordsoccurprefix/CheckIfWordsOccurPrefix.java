package arraystring.chackifwordsoccurprefix;

/*
Given a sentence that consists of some words separated by a single space, and a searchWord,
check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word.
If searchWord is a prefix of more than one word, return the index of the first word (minimum index).
If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.
 */


public class CheckIfWordsOccurPrefix {

    public static int isPrefixOfWord(String sentence, String searchWord) {
        int idx = -1;
        String[] array = sentence.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].startsWith(searchWord)) {
                idx = i + 1;
                break;
            }
        }
        return idx;
    }

}
