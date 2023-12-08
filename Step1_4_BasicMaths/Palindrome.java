/*
Problem Statement

Check whether a given number is 'n' is a palindrome number.

*/

import java.util.Scanner;

public class Palindrome {
    public boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }

        if (n == rev) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(n));

        s.close();
    }
}
