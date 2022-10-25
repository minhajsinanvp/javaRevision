package com.minhaj;

public class ArmStrong {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {

            boolean check = armS(i);

            if(check){
                System.out.print(i +" ");
            }


        }

    }

    static Boolean armS(int a){
        int val =0;
        int firstvalue = a;
        while (a > 0) {

            int temp = a%10;

            val += temp*temp*temp;

            a /=10;



        }
        if(val == firstvalue){
            return true;

        }

        return false;

    }
}
