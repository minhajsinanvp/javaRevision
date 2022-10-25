package com.minhaj;

import java.util.Scanner;

public class methodss {


    public static void main(String[] args) {

        sum();
        System.out.println(greeting("minhaj"));

    }

    static void sum(){

        Scanner input = new Scanner(System.in);
        System.out.println("enter two number for finding sum: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum :" + sum);

    }

    static String greeting(String name){
        return "welcome " + name;
    }


}
