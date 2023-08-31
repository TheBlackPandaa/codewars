package com.codewars;

import java.util.Arrays;

public class StopgninnipSMysdroW {
    public static void main(String[] args){
    String sentence = "Hey fellow java warriors";
    String[] array = sentence.split(" ");
    System.out.println(Arrays.toString(array));
    for(int i=0;i<array.length;i++){
        if(array[i].length()>=5){
            String temp ="";
            char ch;
            for(int j=0;j<array[i].length();j++){
                ch = array[i].charAt(j);
                System.out.println(ch);
                temp = ch+temp;
            }
            array[i] = temp;
        }
    }
    System.out.println(Arrays.toString(array));
    sentence ="";
    for(int i=0;i<array.length-1;i++){
        sentence = sentence + array[i]+" ";
    }
    int temp = array.length;
    sentence = sentence + array[temp-1];
    System.out.println(sentence);
}
}
