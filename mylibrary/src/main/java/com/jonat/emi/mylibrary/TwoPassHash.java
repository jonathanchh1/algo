package com.jonat.emi.mylibrary;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Johnobinnachuksorji on 10/12/2018.
 */

public class TwoPassHash {

    /*
    To improve our run time complexity, we need a more efficient way to
    check if the complement exists in the array
    if the complement exists, we need to look up its index.
    what is the best way to maintain a mapping of each element
    in the array to its index? A Hash Table.

    We reduce the look up time from 0(n) to 0(i) by Trading space for speed. A hashtable
    is built exactly for this purpose. it supposts fast look up in near constant time. i say "near"
    because if a collision ocurred, a look up could degenerate to 0(n) time. But look up hashtable should
    be amortized 0{1) time as long as the hash function was chosen carefully.

    A simple implementation uses two iterations. In the first iteration, we add each element's
    value and its index to the table. Then, in the second iteration we check if each element's
    complement (target  -- nums[i]) exists in the table. Beware that the complement must not be
    nums[i] itself.
     */

    public int[] twosum(int[] nums, int target){
        Map<Integer, Integer> maps = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            maps.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int complement = nums[i] - target;
            if(maps.containsKey(complement) && maps.get(complement) != i){
                return new int[]{i, maps.get(complement)};
            }
        }

        throw new IllegalArgumentException("no two sum solution");
    }


    /*          COMPLEXITY ANALYSIS

    Time complexity: 0(n). We traverse the list containing n elements exactly twice.
    Since the hash table reduces the look up time to 0(1), the time complexity is
    0(n)

    Space complexity : 0(n). The extra space required depends on the number of
    items stored in the hash table, which stores exactly n elements.

     */
}
