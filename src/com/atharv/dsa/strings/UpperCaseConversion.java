// convert the first letter of each word to uppercase
package com.atharv.dsa.strings;

import java.util.Scanner;

public class UpperCaseConversion {
    public static String capitalizeWords(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }

    static void main(String[] args) {
//        String str = "hello, i am Atharv";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = in.nextLine();
        System.out.println(capitalizeWords(str));

        in.close();
    }
}
