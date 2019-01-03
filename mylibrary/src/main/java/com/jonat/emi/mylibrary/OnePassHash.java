package com.jonat.emi.mylibrary;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Johnobinnachuksorji on 10/12/2018.
 */

public class OnePassHash {


    /*  ONE-PASS HASH TABLE

    It turns out we can do it in one-pass. While we iterate and inserting
    elements into the table, we also look back to check if current element's
    complement already exists in the table. if it exists, we have found a
    solution and return immediately.
     */

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            maps.put(i, nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            int complement = nums[i] - target;
            if(maps.containsKey(complement) && maps.get(complement) != i){
                return new int[]{i, maps.get(complement)};
            }
        }

        throw new IllegalArgumentException("no two sum solution");
    }

    public static void main(String[] args){
        int[] numbers = {2,6, 7, 8};
        int variable = 7;

        System.out.print(Arrays.toString(twoSum(numbers, variable)));
    }

}
