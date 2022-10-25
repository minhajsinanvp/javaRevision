package com.minhaj;

import java.util.Arrays;

public class Arrayas {
    public static void main(String[] args) {
        int [] roll_number = new int[5];
        String [] name = {"minhaj","sinz","monu"};

//        for (String i : name){
//            System.out.println(i);
//        }
//        System.out.println(Arrays.toString(name));
        System.out.println(name[0]);
        change(name);
        System.out.println(name[0]);
    }


    static  void change(String changeName[]){
        changeName[0] = "musfira";
    }
}
