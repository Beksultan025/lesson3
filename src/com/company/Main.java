package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {-5.7, 3.5, 5.6, -7, 5, 3.9, -9.9, 9.9, 5.5, -5.6, 2.4, -2.6, -8.0, 7.7, -5.1, 7.9};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}