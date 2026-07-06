//generate substrings with and without inbuilt functions
package com.atharv.dsa.strings;

import java.util.*;

public class SubstringExample {
    public static String getSubstring(String str, int si, int ei) {
        String newStr = "";
        for (int i = si; i < ei; i++) {
            newStr += str.charAt(i);
        }

        return newStr;
    }

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = in.next();

//        System.out.println(getSubstring(str, 0, 5));

        //direct method in java
        //str.substring(0,5);
        System.out.println(str.substring(0,5));

        in.close();
    }
}
