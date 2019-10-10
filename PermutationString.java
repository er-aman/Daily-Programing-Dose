package com.aman.database;

import java.util.Arrays;

public class PermutationString {
    public static boolean checKIfHasPermutation(String s1, String s2){
        s1 = sorted(s1);
        for(int i = 0; i <= s2.length() - s1.length();i++){
            if(s1.equals(sorted(s2.substring(i,i+s1.length()))))
                return true;
        }
        return false;
    }
    public static String sorted(String s){
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main (String[] args ){
        System.out.println(checKIfHasPermutation("ab","eidboaoo"));
    }
}
