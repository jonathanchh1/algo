package com.jonat.emi.mylibrary;

/**
 * Created by Johnobinnachuksorji on 10/26/2018.
 */

public class test1 {


    public static double medianSortedArray(int[] girls, int[] boys){

        int girllist = girls.length;
        int boyslist = boys.length;

        if(girllist > boyslist){

            int[] merge = girls;
            girls = boys;
            boys = merge;

            int listitems = girllist;
            girllist = boyslist;
            boyslist = listitems;

            int minStudents = 0; int maxStudents = girllist; int halflist = (girllist + boyslist + 1) / 2;
            while(minStudents < maxStudents){

                int currentlist = (minStudents + maxStudents) / 2;
                int futurelist = halflist - currentlist;

                if(currentlist < maxStudents && boys[futurelist - 1] > girls[currentlist]){
                    minStudents = currentlist + 1; //list is too small;
                }else if(currentlist > minStudents && girls[currentlist - 1] > boys[futurelist]){
                     minStudents = currentlist - 1; //list is too big
                }else{

                    //list is perfect;
                    int firstlist = 0;
                    if(currentlist == 0){
                        firstlist = boys[futurelist - 1];
                    }else if(futurelist == 0){
                        firstlist = girls[currentlist - 1];
                    }else{
                        firstlist = Math.max(girls[currentlist - 1], boys[futurelist - 1]);
                        if((girllist + boyslist % 2 == 1)){
                            return firstlist;
                        }

                        int secondlist = 0;
                        if(currentlist == girllist){
                            secondlist = boys[futurelist];
                        }else if(currentlist == boyslist){
                            secondlist = girls[currentlist];
                        }else{
                            secondlist = Math.min(boys[futurelist], girls[currentlist]);
                            return (firstlist + secondlist) / 2.0;
                        }
                    }
                }
            }
        }
        return 0.0;
    }

    public static void main(String[] args){
        ;
        String[] value = new String[] {"viivaa"};

    }

}
