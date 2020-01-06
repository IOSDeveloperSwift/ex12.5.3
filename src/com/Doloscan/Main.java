package com.Doloscan;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Main {

    public static void main(String[] args) {

        String str1 = "ab5c2d4ef12s";
        System.out.println("The given String is: " + str1);
        System.out.println("The sum of Digits is: " + sumOfDigits(str1));

    }

    public static int sumOfDigits(String str) {
        int len = str.length();
        int sum = 0;

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                String tmp = str.substring(i, i + 1);
                sum += Integer.parseInt(tmp);
            }
        }
        return sum;
    }
}
