import java.util.Scanner;

/*

Problem Statement

Write a program to input an integer 'n' and print the 
sum of all its even digits and the sum of all its odd 
digits separately.

Digits mean numbers, not places! That is, if the given 
integer is "132456", even digits are 2, 4, and 6, and 
odd digits are 1, 3, and 5.

Constraints: 0 <= 'n' <= 10000

*/

public class SumofEvenOdd {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int y = 0, z = 0;

        while (n > 0) {
            int x = n % 10;
            if (x % 2 == 0) {
                y += x;
            } else {
                z += x;
            }
            n = n / 10;
        }
        System.out.println(y + " " + z);
        s.close();
    }
}
