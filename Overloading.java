package com.minhaj;

public class Overloading {
    public static void main(String[] args) {

        fun("minhaj");
        fun(10000);

    }
    static  void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Name is " + name);
    }
}
