package com.bridgelabz;
class Recursion {
    static int fib(int N) {
       if(N <= 1) {
           return N;
       }
       return fib(N - 1) + fib( N - 2);
    }
    public static void main(String[] args) {

        int N = 10;
        for(int i = 0;i<N;i++){
            System.out.println(fib(i) + " ");
        }
    }
}
