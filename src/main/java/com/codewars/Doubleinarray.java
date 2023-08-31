package com.codewars;

import java.util.Arrays;

public class Doubleinarray {
    public static void main(String[] args) {
        int[] map = {1,2,3};
        for(int i=0;i<map.length;i++) map[i] *= 2;
        System.out.println(Arrays.toString(map));
    }
}
