package arraystring.fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

    /*
    Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
     */

    public static List<String> fizzBuzz1(int n) {
        String[] answer = new String[n];
        int j = 1;
        for (int i = 0; i < answer.length; i++) {
            if (j%3 == 0 && j%5 ==0) {
                answer[i] = "FizzBuzz";
                j++;
            } else if (j%3 == 0) {
                answer[i] = "Fizz";
                j++;
            } else if (j%5 == 0) {
                answer[i] = "Buzz";
                j++;
            } else {
                answer[i] = String.valueOf(j);
                j++;
            }
        }
        return Arrays.stream(answer).toList();
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> answer = new ArrayList<>();
        int j = 1;
        for (int i = 0; i < n; i++) {
            if (j%3 == 0 && j%5 ==0) {
                answer.add("FizzBuzz");
                j++;
            } else if (j%3 == 0) {
                answer.add("Fizz");
                j++;
            } else if (j%5 == 0) {
                answer.add("Buzz");
                j++;
            } else {
                answer.add(String.valueOf(j));
                j++;
            }
        }
        return answer;
    }

    public static List<String> fizzBuzz3(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i+1)%3 == 0 && (i+1)%5 ==0) {
                answer.add("FizzBuzz");
            } else if ((i+1)%3 == 0) {
                answer.add("Fizz");
            } else if ((i+1)%5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf((i+1)));
            }
        }
        return answer;
    }



}
