package com.syntax.Class15;

public class ArrayUtils {

    void printArray(int [] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

    int sumArray(int[] arr){
        int sum=0;
        for(int num:arr){
            sum=sum+num;
        }
        return sum;
    }

}