package com.jonat.emi.mylibrary;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Johnobinnachuksorji on 9/21/2018.
 */

public class PermutationPalindrome {

    /**
     * HASH SET to resolve palindrome problems!!
     *
     * Solution
     Our approach is to check that each character appears an even number of times, allowing for only one character to appear an odd number of times (a middle character). This is enough to determine if a permutation of the input string is a palindrome.

     We iterate through each character in the input string, keeping track of the characters we’ve seen an odd number of times using a hash set unpairedCharacters.

     As we iterate through the characters in the input string:

     If the character is not in unpairedCharacters, we add it.
     If the character is already in unpairedCharacters, we remove it.
     Finally, we just need to check if less than two characters don’t have a pair.
     */


    public static boolean hasPalindromePermutation(String theString){
        //track characters we've seen an odd number of times

        Set<Character> unpairedCharacters = new HashSet<>();

        for(char c : theString.toCharArray()){
            if(unpairedCharacters.contains(c)){
                unpairedCharacters.remove(c);
            }else{
                unpairedCharacters.add(c);
            }
        }
        //the string has a palindrome permutation if it
        //has one or zero characters without a pair.
        return unpairedCharacters.size() <= 1;
    }



    public static void main(String[] args){
        String word = "civic";
        System.out.println(hasPalindromePermutation(word));
    }
}
