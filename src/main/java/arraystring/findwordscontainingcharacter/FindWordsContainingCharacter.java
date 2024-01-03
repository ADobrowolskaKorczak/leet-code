package arraystring.findwordscontainingcharacter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindWordsContainingCharacter {

    /*
    You are given a 0-indexed array of strings words and a character x.
    Return an array of indices representing the words that contain the character x.
    Note that the returned array may be in any order.
     */

    public static List<Integer> findWordsContaining1(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
                if (words[i].indexOf(x) != -1) {
                    list.add(i);
                }
        }
        return list;
    }

    public static List<Integer> findWordsContaining2(String[] words, char x) {
        return IntStream.range(0, words.length)
                .filter(y -> words[y].indexOf(x) != -1)
                .boxed().toList();
    }









}
