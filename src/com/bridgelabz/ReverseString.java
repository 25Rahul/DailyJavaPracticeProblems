package com.bridgelabz;
class ReverseString{
    public static void main (String[] args) {

        String str= "Rahul", nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Rahul");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
