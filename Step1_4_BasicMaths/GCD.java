package Step1_4_BasicMaths;

import java.util.Scanner;

public class GCD {
    public int calcGCD(int a, int b) {
        // Write your code here.
        if (b == 0) {
            return a;
        } else {
            return calcGCD(b, a % b);
        }
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
