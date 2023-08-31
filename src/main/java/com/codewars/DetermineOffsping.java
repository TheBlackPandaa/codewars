package com.codewars;

import java.util.Arrays;

public class DetermineOffsping {

    public static void main(String[] args){
        String sperm = "XY";
        if(sperm.contains("Y")){
            System.out.println("Congratulations! You're going to have a son.");
        }else{
            System.out.println("Congratulations! You're going to have a daughter.");
        }
    }
}
