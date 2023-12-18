package Step1_5_BasicRecursion;

//Problem: Print your Name N times using recursion

import java.util.Scanner;

public class PrintNtimes {
    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("xyz");
        printName(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printName(1, n);

        s.close();
    }
}
