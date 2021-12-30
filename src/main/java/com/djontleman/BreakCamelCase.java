package com.djontleman;

public class BreakCamelCase {

    public static void main(String[] args) {
        String result = Solution.camelCase("camelCasing");
        System.out.println(result);
    }
}

class Solution {
    public static String camelCase(String input) {
        // setup
        String output = "";
        char currentChar;

        // loop through input and get character
        for (int i = 0; i < input.length(); i++) {
            currentChar = input.charAt(i);
            if (currentChar - 90 >= -25 && currentChar - 90 <= 0) { // if capital (ASCII representation)
                output += " ";
            }
            output += currentChar;
        }

        return output;
    }
}
