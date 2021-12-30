package com.djontleman;

import java.util.Arrays;

public class SplitStrings {

    public static void main(String[] args) {
        String[] result = solution("abcdef");
        System.out.println(Arrays.toString(result));
    }

    // Kata
    public static String[] solution(String s) {
        // empty input string
        if (s.length() < 1) {
            return new String[0];
        }

        // make array containing each individual letter in s
        String[] letters = s.split("");

        // make array of half the length of letters array (+1 if odd length)
        String[] pairedLetters = new String[letters.length / 2 + letters.length % 2];

        int j = 0; // index of pairedLetters
        for (int i = 0; i < letters.length; i = i + 2) { // loop through letters
            if (i + 1 == letters.length) {
                pairedLetters[j] = letters[i] + "_"; // if last letter (array has odd length)
            } else {
                pairedLetters[j] = letters[i] + letters[i+1];
            }
            j++;
        }

        return pairedLetters;
    }
}
