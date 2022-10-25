package com.minhaj;

import java.util.Scanner;

public class switchh {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String fruit = obj.next();

        switch (fruit) {
            case "mango" -> System.out.println("Its a have large variety and major used for making pickle");
            case "apple" -> System.out.println("Healthy fruit and become reson for inveting gravity");
            default -> System.out.println("Unknown fruit");
        }
    }

}
