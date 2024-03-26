package com.recursion.lecture1.two;

public class Test {

    public void display(int N){
        if(N==1){
            System.out.print(1+" ");
            return;
        }

        display(N-1);
        System.out.print(N+" ");
    }
}
