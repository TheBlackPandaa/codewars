package com.codewars;

public class ReversedStrings {
    public static void main(String[] args) {
        String str = "world";
        String st = new StringBuilder(str).reverse().toString();
        System.out.println(st);
    }
}
