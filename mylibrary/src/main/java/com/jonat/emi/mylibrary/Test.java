package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 4/27/2018.
 */
 public class Test {


 public static int Max(int[] height){

  int maxarea = 0;
  int left = 0;
  int right = height.length - 1;

  while(left < right){

   maxarea = Math.max(maxarea, Math.min(height[left], height[right]) *
           (right - left));
   System.out.println("maxmium area : " + Math.min(height[left], height[right]) + "substraction : " + (right - left));
   System.out.println("complete value : " + String.valueOf(Math.max(maxarea, Math.min(height[left], height[right]) *
           (right - left))));
   if(height[left] < height[right]){
     left++;
   }else{
    right--;
   }
  }
  return maxarea;
 }

 public static void main(String[] args){
  int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
  System.out.println(Max(arr));
 }
}

