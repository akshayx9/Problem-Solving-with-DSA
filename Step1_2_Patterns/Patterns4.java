package Step1_2_Patterns;

import java.util.Scanner;

public class Patterns4 {
    public static void printPattern19(int n) {
        int inis = 0;
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            inis += 2;
            System.out.println(" ");
        }

        inis = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            inis -= 2;
            System.out.println(" ");
        }
    }

    public static void printPattern20(int n) {
        int spaces = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;

            // stars
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            if (i < n) {
                spaces -= 2;
            } else {
                spaces += 2;
            }
        }
    }

    public static void printPattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void printPattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns4.printPattern22(n);
        }
        s.close();
    }
}
