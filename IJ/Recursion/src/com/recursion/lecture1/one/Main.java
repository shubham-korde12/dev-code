package com.recursion.lecture1.one;
// find factorial of N naturial number using recursion
public class Main {

    public static void main(String[] args) {
    int N=5;
        Test test=new Test();
       long fact= test.fact(N);

        System.out.println("Factorial of N is "+fact);
    }
}
