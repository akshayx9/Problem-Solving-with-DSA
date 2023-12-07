package Patterns;

import java.util.Scanner;

public class Patterns3 {
    public static void printPattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println(" ");
        }
    }

    public static void printPattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    public static void printPattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    public static void printPattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    public static void printPattern17(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // char
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printPattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (int) ('A' + n - 1 - i); ch <= (char) (int) ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns3.printPattern18(n);
        }
        s.close();
    }
}
