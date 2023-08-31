package com.codewars;

public class VowelCount {
    public static void main(String[] args) {
        String s = "fsdjihfgkuahjsgdfuliashliodfhjaspoiudfhlkjasdhflkjashdfklhasdlkjfhaslkjdhflakjsd";
        int count = 0;
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        int st = s.length();
        System.out.println(st);
        for (int j = 0; j <st ; j++) {
            if (s.charAt(j) == a) {
                count = count + 1;
            }
            if (s.charAt(j) == e) {
                count = count + 1;
            }
            if (s.charAt(j) == i) {
                count = count + 1;
            }
            if (s.charAt(j) == o) {
                count = count + 1;
            }
            if (s.charAt(j) == u) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
