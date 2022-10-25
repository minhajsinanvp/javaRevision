package com.minhaj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> rollNo = new ArrayList<>(10);
        ArrayList<String>  names = new ArrayList<>(10);
//        for (int i = 0; i <10 ; i++) {
//
//            name.add(in.next());
//
//
//
//        }

        String [] name = {"minhaj", "sinan", "jameela", "musfira", "mansoor", "ashraf", "febi", "lallu", "mathu","chottu"};

        names.addAll(List.of(name));
//        System.out.println(name);
//        System.out.println(name.contains("musfira"));
//        System.out.println(Arrays.toString(name));
//        swap(name,0,2);
//        System.out.println(Arrays.toString(name));
//        System.out.println(name.repl);

//        ArrayList<ArrayList<Integer>> TwoD = new ArrayList<>(10);
//        for (int i = 0; i <3 ; i++) {
//
//            TwoD.add(new ArrayList<>());

        System.out.println(Arrays.toString(name));
        reverse(name);
        System.out.println(Arrays.toString(name));
//
//        }


    }
    static void swap(String [] arrFamilyNames,int first,int seco){
        String temp = arrFamilyNames[first];
        arrFamilyNames[first]  = arrFamilyNames[seco];
        arrFamilyNames[seco] = temp;

    }

    static void reverse(String [] arr){
        int start = 0;
        int end = arr.length -1;
        while(start< end){
            swap(arr,start,end);
            start++;
            end--;

        }



    }
}
