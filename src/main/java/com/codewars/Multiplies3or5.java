package com.codewars;

import java.util.Arrays;

public class Multiplies3or5 {
    public static void main(String[] args){
        int number =9;
        int[] arr = new int[number];
        for(int i=0; i<number; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=0;i<number;i++)
        {
            if(arr[i] % 3 == 0 || arr[i] % 5 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
