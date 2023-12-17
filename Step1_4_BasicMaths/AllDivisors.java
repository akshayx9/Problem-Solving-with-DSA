package Step1_4_BasicMaths;

import java.util.Scanner;

//We are given a number n. The task is to print all the divisors of n. 

public class AllDivisors {
    public void printDivisors(int n) {
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        for (; i >= i; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        AllDivisors d = new AllDivisors();

        int n = s.nextInt();
        d.printDivisors(n);

        s.close();
    }
}
