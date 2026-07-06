// find the lexicographically largest string using compareTo()
package com.atharv.dsa.strings;

import java.util.Scanner;

public class LargestString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruits[] = {"Mango", "apple", "banana"};

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);

        in.close();
    }
}
