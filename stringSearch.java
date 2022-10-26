package com.minhaj;
//
//import java.util.Arrays;
//

public class stringSearch {
//    public static void main(String[] args) {
//        String name = "jhonny";
//        char tar = 's';
//        System.out.println(Arrays.toString(name.toCharArray()));
////        boolean val = checking(name, tar);
////        System.out.println(val);
//    }
//
//    static boolean checking2(String value, char target) {
//
//        if (value.length() == 0) {
//
//            return false;
//        }
//        for(char ch : value.toCharArray()){
//            if(ch ==  target){
//                return  true;
//            }
//        }
//        return false;
//
//
//    }
//
//
//    static boolean checking(String value, char target) {
//
//        if (value.length() == 0) {
//
//            return false;
//        }
//        for (int i = 0; i < value.length(); i++) {
//            if (target == value.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//
//
    public static void main(String[] args) {

        int [] sample = {1,2,3,5,6,74,5,7,54,345,23,54,80};
        System.out.println(SearchForIndex(sample,99,1,5));
}

    static int SearchForIndex(int [] arr,int target,int start,int end){

        if(arr.length == 0){
            return -1;
        }
        for (int k = start; k <=end ; k++) {
            if(arr[k] == target){
                return k;

            }
        }
        return -1;
    }
}
