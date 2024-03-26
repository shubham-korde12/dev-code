package com.recursion.lecture1.one;

public class Test {

    public long fact(int N){
        if(N==1) return 1;

        return N*(fact(N-1));
    }
}
