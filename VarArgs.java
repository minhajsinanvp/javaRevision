package com.minhaj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        fun(1,23,3,4,24,24,13123,123,2);

        multiple(1,8,"minhaj","sinan","musifra");
    }


    static void multiple(int a,int b ,String ...words){
        System.out.println(a+b);
        System.out.println(Arrays.toString(words));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
