package com.djontleman;

import java.util.HashMap;

public class GreedIsGood {

    public static void main(String[] args) {
        int result = greedy(new int[]{2, 4, 4, 5, 4});
        System.out.println(result);
    }

    // Kata
    public static int greedy(int[] dice){

        HashMap<Integer, Integer> scoreMap = new HashMap<>();
        for (int num : dice) {
            if (scoreMap.containsKey(num)) {
                scoreMap.replace(num, scoreMap.get(num) + 1);
            } else {
                scoreMap.put(num, 1);
            }
        }

        int[] scoreValues = new int[]{1000, 200, 300, 400, 500, 600};

        int score = 0;
        for (int i = 1; i <= 6; i++) {
            Integer value = scoreMap.get(i);
            if (value != null) {
                if (value >= 3) {
                    score += scoreValues[i - 1];
                    scoreMap.replace(i, value - 3);
                }

                if (i == 1) {
                    score += scoreMap.get(i) * 100;
                } else if (i == 5) {
                    score += scoreMap.get(i) * 50;
                }
            }
        }

        return score;
    }
}
