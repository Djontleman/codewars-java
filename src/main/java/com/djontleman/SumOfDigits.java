package com.djontleman;

public class SumOfDigits {

    public static void main(String[] args) {
        int result = DRoot.digital_root(132189);
        System.out.println(result);
    }
}

class DRoot {
    public static int digital_root(int n) {

        // convert int n to string
        String stringN = String.valueOf(n);

        // loop breaks when result is only 1 digit
        while (stringN.length() > 1) {
            // converts each digit to int and adds them
            int result = 0;
            for (int i = 0; i < stringN.length(); i++) {
                int number = Character.getNumericValue(stringN.charAt(i));
                result += number;
            }
            // convert result to string
            stringN = String.valueOf(result);
        }

        // return single digit string as integer
        return Integer.parseInt(stringN);
    }
}
