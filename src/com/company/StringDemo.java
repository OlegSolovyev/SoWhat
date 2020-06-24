package com.company;

public class StringDemo {
    public static void main(String[] args){
        char[] chArray={'h','e','l','l','o'};
        String s="hello Java";
        String s1= new String("hello");
        String s2= new String(chArray);
        System.out.println(s2);
        for (char ch:chArray){
            System.out.println(ch);
        }
        System.out.println(s.compareTo(s1));
        char[] chars=s.toCharArray();
        String newString=s.substring(5);
        System.out.println(newString);
        System.out.println(newString.trim());
        String[] string=s.split("l");
        for (String ss:string){
            System.out.println(ss);
        }
        System.out.println(s.replaceAll("l","!"));
    }
}
