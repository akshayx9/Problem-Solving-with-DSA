package Step1_4_BasicMaths;

import java.util.Scanner;

// We are given two numbers. The task is to compute Power(x,n)  which means x to the power y, using, Iterative Power (Binary Exponentiation)

public class ComputingPower {
    public int power(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res * x;
            }
            x = x * x;
            n = n / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ComputingPower cp = new ComputingPower();

        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(cp.power(x, n));

        s.close();
    }
}
