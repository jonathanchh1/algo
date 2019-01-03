package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 11/6/2018.
 */

public class Atoi {

    private static String palindrom(String s){

        if(s == null || s.length() == 0){
            return " ";
        }
        //babad
        int start = 0; int end = 0;

        for(int cur = 0; cur < s.length(); cur++) {

            int right = findCenter(s, cur, cur);
            //System.out.println("values 1 right:" + s + " index 1 : " + String.valueOf(cur) + " index 2 : " + String.valueOf(cur));
            int left = findCenter(s, cur, cur + 1);
          //  System.out.println("values 1 left:" + s + " index 1 : " + String.valueOf(cur) + " index 2 : " + String.valueOf(cur + 1));

            int length = Math.max(right, left);
             System.out.println(String.valueOf(length));

            if(length > end - start){
                start = cur - (length - 1) / 2;
                System.out.println( "index start : " + String.valueOf(cur) + " - " + " substract length : " + String.valueOf(cur - (length - 1) / 2));
                end = cur + length / 2;
               // System.out.println( "index end : " + String.valueOf(cur) + " - " + " substract length : " + String.valueOf(cur + length / 2));

            }
        }

        return s.substring(start, end + 1);
    }

    private static int findCenter(String s, int left, int right){
        int l = left;
        int r = right;

        while(l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)){
            l--;
            r++;
        }

        return r - l - 1;
    }

    public static void  main(String[] args){

        String s = "babababababad";
        System.out.println(palindrom(s));
    }
    }

