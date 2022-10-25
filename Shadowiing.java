package com.minhaj;

public class Shadowiing {
    static int x =90; //this is will be shadowed in line 10

    public static void main(String[] args) {

        System.out.println(x);

        int x =45;
        System.out.println(x);
        fun();




    }

    static void fun(){
        System.out.println(x);
    }
}
