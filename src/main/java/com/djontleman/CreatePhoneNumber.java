package com.djontleman;

public class CreatePhoneNumber {

    public static void main(String[] args) {
        String result = Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(result);
    }
}

class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = "(" + numbers[0] + numbers[1] + numbers[2] + ") " +
                numbers[3] + numbers[4] + numbers[5] + "-" +
                numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return phoneNumber;
    }
}
