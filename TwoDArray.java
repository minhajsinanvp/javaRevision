package com.minhaj;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] twoDArray = new int[3][2];

        for (int row = 0; row < twoDArray.length; row++) {


            System.out.printf("Enter the %d row : ", row + 1);
            for (int col = 0; col < twoDArray[row].length; col++) {

                twoDArray[row][col] = in.nextInt();


            }

        System.out.println(Arrays.toString(twoDArray));


        }
    }
}
