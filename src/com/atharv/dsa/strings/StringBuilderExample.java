//basic StringBuilder operations in Java
package com.atharv.dsa.strings;

public class StringBuilderExample {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Atharv");
        sb.append(" Parit");
        System.out.println(sb);

//        sb.insert(2,"hello");
//        sb.delete(2,4);
//        sb.deleteCharAt(6);
//        sb.replace(7,12,"Builds");
//        sb.reverse();
        String s = sb.toString();
        System.out.println(s.toUpperCase());

    }
}
