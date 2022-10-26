package com.minhaj;

public class binaryClass {
    public static void main(String[] args) {
        int [] testing = {1,2,3,5,6,7,8,9};
        int sear = 10;
        System.out.println(bibarySearch(testing,sear));

    }
    static int bibarySearch(int [] nums , int target){
        int start = 0;
        int end = nums. length -1;
        while (start <= end){
            int mid  = start + ((end-start)/2);
            if(target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}
