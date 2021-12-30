package com.djontleman;

public class BitCounting {

    public static void main(String[] args) {
        int result = countBits(1234);
        System.out.println(result);
    }

    // Kata
    public static int countBits(int n){
        // Determines the number of binary digits
        int power = 0;

        while(n - (int)Math.pow(2, power) >= 0)
        {power++;}

        // Makes an array representation of n in binary
        int[] binaryRep = new int[power];

        for (int i = 0; i < binaryRep.length; i++) {
            power--;

            if (n - (int)Math.pow(2, power) >= 0) {
                binaryRep[i] = 1;
                n = n - (int)Math.pow(2, power);
            } else {
                binaryRep[i] = 0;
            }
        }

        // counts the number of 1s in the binary
        int count = 0;
        for (int element : binaryRep) {
            if (element == 1) {
                count++;
            }
        }
        return count;
    }
}
