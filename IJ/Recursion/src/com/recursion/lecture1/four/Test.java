package com.recursion.lecture1.four;

public class Test {

    public int calSum(int N){

        if(N==1){
            return 1;
        }

        return N+ calSum(N-1);

    }
}
