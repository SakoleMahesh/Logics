package com.logics;

import java.util.Scanner;

public class String_Is_Palindrome
{
	static boolean flag=true;
	 static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
     {
       
        String A=sc.next();
        isPalindrome(A);
        if(flag)
        System.out.println("Yes");
        else
        System.out.println("No");
        sc.close();
     }
    

public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1))
             {
                flag=false;       
              }        
    }
    return flag;
}
}
