package com.bridgelabz;

public class RemoveSpaces {
    static int remove(char[] str){
    int count = 0;
       for(int i=0;i<str.length;i++) {
           if(str[i] != ' ') {
               str[count] = str[i];
               count++;
           }
       }
       return count;
    }
    public static  void main(String[] args){
        char[] str = "I want to go for Lunch".toCharArray();
        int count = remove(str);
        System.out.println(String.valueOf(str).subSequence(0, count));
    }
}
