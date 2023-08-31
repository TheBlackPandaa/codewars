package com.codewars;

public class DisenvowelTrolls {
    public static void main(String[] args){
        String str = "This website is for losers LOL!";
        String st = str.replaceAll("[aAeEiIoOuU]", "");
        System.out.println(st);
    }
}
