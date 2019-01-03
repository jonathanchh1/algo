package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 10/12/2018.
 */

public class bruteforceM {

    /*
    the brute force approach is simple. loop through each * element and find if there is another
    value that equals to target - x;

     */


    /*   THE ACTUAL PROBLEM:

    Given an array of integers, return indices of the two numbers such
    that they add up to a specific target.

   You may assume that each input would have exactly one solution, and
   you may not use the same element twice;

     */

    public int[] twosum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    /*
    Complexity Analysis :
          Time complexity : O(n^2)O(n2).
           For each element, we try to find its complement by looping through
           the rest of array which takes O(n)O(n) time. Therefore,
           the time complexity is O(n^2)O(n2).

   Space complexity : O(1)O(1).      */




    public static void main(int[] string){
        int[] numbers = new int[]{2, 3, 1, 6, 7};

        System.out.println();

    }
}
