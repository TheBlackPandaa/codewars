package com.codewars;

import java.util.Arrays;

public class TurtleRace {

    public static void main(String[] args) {
        int v1 = 720;
        int v2 = 850;
        int g = 70;
        if (v1 >= v2){
            int[] r = {-1,-1,-1};
            System.out.println(Arrays.toString(r));
        }
        int seconds = (g * 3600) / (v2 - v1);
        int[] l = {seconds / 3600, (seconds % 3600) / 60, seconds % 60};
        System.out.println(Arrays.toString(l));
    }

}
