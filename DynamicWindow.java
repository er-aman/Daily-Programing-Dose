package com.aman.database;

public class DynamicWindow {
    public static int smallestSubarray(int k,int[] arr){
        int window_size = Integer.MAX_VALUE;
        int cur_wind_sum = 0;
        int window_start =0;
        for(int window_end =0; window_end<arr.length;window_end++){
            cur_wind_sum+=arr[window_end];
            while(cur_wind_sum>=k){
                window_size = Math.min(window_size,window_end-window_start + 1);
                cur_wind_sum -= arr[window_start];
                window_start++;
            }
        }
        return window_size;
    }
    public static void main(String[] args){
        int[] input = new int[]{4,2,7,8,1,2,8,10};
        int target =8;
        System.out.println(smallestSubarray(8, input));
    }
}
