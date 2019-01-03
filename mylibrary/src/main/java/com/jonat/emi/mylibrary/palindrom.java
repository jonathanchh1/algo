package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 10/27/2018.
 */

public class palindrom {

    public String longestPalindrome(String pletters) {
        if(pletters == null || pletters.length() < 1)
            return "";
  // babababababababa
        int start = 0, end = 0;
        for(int pcurrentletters = 0; pcurrentletters < pletters.length(); pcurrentletters++){
            int scanletter = expandAroundCenter(pletters, pcurrentletters, pcurrentletters);
            int scanletter2 = expandAroundCenter(pletters, pcurrentletters, pcurrentletters);
            int scan = Math.max(scanletter, scanletter2);

            if(scan > end - start){
                start = pcurrentletters - (scan - 1) / 2;
                end = pcurrentletters + scan / 2;
            }
        }

        return pletters.substring(start, end + 1);
    }

    private int expandAroundCenter(String letters, int leftletters, int rightletters){
        int left = leftletters, right = rightletters;
        while(left >= 0 && right < letters.length() && letters.charAt(left) == letters.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}
