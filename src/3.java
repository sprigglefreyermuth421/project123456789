package com.example.project123456789;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("The generated number is: " + randomNumber);
    }
}
