//Check whether a given string is a palindrome
package com.atharv.dsa.strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();


//        System.out.println(isPalindrome(str));
        if (isPalindrome(str)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        in.close();
    }
}
