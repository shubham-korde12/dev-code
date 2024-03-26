package com.recursion.lecture1.three;
// check string, if it is palindrome or not
public class Main {

    public static void main(String[] args) {
        String s="madam";
        int N=s.length();
        int l=0;
        int r=N-1;
        Test test = new Test();

        Boolean result=test.isPalindrome(s,l,r);
        System.out.println(result);

    }
}
