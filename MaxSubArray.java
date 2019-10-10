package com.aman.database;

public class MaxSubArray {
    public static int findMaxSumSubArray(int[] arr, int k){
        int max_val = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int i =0; i< arr.length; i++){
            curr_sum += arr[i];
            if(i>=k-1){
                max_val = Math.max(max_val,curr_sum);
                curr_sum -= arr[i-(k-1)];
            }
        }
        return max_val;
    }
    public static void main(String[] args) {
        System.out.println(findMaxSumSubArray(new int[]{4,2,1,7,8,1,2,8,1,0},3));
    }
}
