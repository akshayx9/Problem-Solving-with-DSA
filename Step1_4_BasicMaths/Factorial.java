package Step1_4_BasicMaths;

/* 

Problem Statement

Write a program to find the factorial of a given number 'n'. */

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {

        // Write code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long fact = 1;

        // shows error if the user enters a negative integer
        if (n < 0)
            System.out.println("Error");
        else {
            for (int i = 1; i <= n; ++i) {
                fact *= i;
            }
            System.out.println(fact);
        }
        s.close();
    }
}