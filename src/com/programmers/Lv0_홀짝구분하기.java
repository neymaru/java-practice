package com.programmers;

import java.util.Scanner;
public class Lv0_홀짝구분하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
}