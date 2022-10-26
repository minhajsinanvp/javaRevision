package com.minhaj;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int [][] twoArray = {{2,4,5,3},{9,10,23,4},{-7,234,1}};
//        int  [] ans = TwoSearch(twoArray,-7);
//        System.out.println(Arrays.toString(ans));

        System.out.println(MaxTwo(twoArray));



    }
    static int[] TwoSearch(int [][] sample,int target){
        for (int row = 0; row <sample.length ; row++) {
            for (int column = 0; column < sample[row].length ; column++) {

                if(sample[row][column] == target ){
                    return new int[] {row,column};

                }


            }

        }
        return new int[]{};
    }
    static int MaxTwo(int [][] value){
        int max = Integer.MIN_VALUE;
        for(int[] row : value){
            for (int column : row){
                if(column>                                max){
                    max = column;
                }

            }
        }
        return max;
    }
}
