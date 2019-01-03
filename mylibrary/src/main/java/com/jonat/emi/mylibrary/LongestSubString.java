package com.jonat.emi.mylibrary;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Johnobinnachuksorji on 10/15/2018.
 */

public class LongestSubString {

    //Problem:
    /*
    Check all the substrings one by one to see if it has no duplicate
    character.
     */

    //first Approach bruteForce;




    public int lengthOfLongest(String s){
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                if(allUnique(s, i, j)) ans = Math.max(ans, j - i);

            }
        }
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }







    public int LongestString(String s){
        int answer = 0;
        for(int i = 0; i < s.length(); i++){

            for(int j = i + 1; j < s.length(); j++){

                if(allUni(s, j, i)){
                    answer = Math.max(answer, j - i);
                }
            }
        }
        return answer;
    }

    public boolean allUni(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        for(int i = start; i < end; i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                return false;
            } else{
                set.add(ch);
            }
        }
        return true;
    }


















}
