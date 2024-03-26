package com.recursion.lecture1.three;

public class Test {

    public boolean isPalindrome(String s,int l, int r){

        if(l >=r) return true;

        boolean b = s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1);
        return b;



    }
}
