package com.ctgu;

import java.util.Scanner;

/**
 * @author Elm Forest
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < 1 || a > 100 || b < 1 || b > 100 || c < 1 || c > 100) {
            System.out.println("输入错误");
            return;
        }

        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("非三角形");
            return;
        }

        if (a == b && b == c) {
            System.out.println("等边三角形");
        } else if (a == b || a == c || b == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("一般三角形");
        }
    }
}
