package com.minhaj;

public class Scope {
    public static void main(String[] args) {

        String name = "minhaj";
        {

            name = "sinan";
        }


        System.out.println(name);

    }
}
