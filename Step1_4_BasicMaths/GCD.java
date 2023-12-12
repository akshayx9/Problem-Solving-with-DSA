package Step1_4_BasicMaths;

import java.util.Scanner;

public class GCD {
    public int calcGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GCD d = new GCD();

        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(d.calcGCD(a, b));
        s.close();
    }
}
