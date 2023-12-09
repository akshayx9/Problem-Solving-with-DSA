package Step1_4_BasicMaths;
/*
Problem Statement

A prime number is a positive integer that is divisble by exactly 2 integers, 1 and the number itself.

You are given a number 'n'. Find out whether 'n' is prime or not.

*/

import java.util.Scanner;

public class CheckPrime {
    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CheckPrime cp = new CheckPrime();

        int n = s.nextInt();

        System.out.println(cp.isPrime(n));
        s.close();
    }
}
