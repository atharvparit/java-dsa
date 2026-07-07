// Compress consecutive characters in a string (Amazon)
// Example: aaabbcccdd -> a3b2c3d2
package com.atharv.dsa.strings;

public class StringCompression {
    public static String compress(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            count++;
            if (count>1){
                sb.append(str.charAt(i)).append(count);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    static void main(String[] args) {
        String str = "aaabbcccdddd";
//        String str = "abc";
        System.out.println(compress(str));
    }
}
