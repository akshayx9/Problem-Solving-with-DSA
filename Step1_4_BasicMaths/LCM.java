package Step1_4_BasicMaths;

import java.util.Scanner;

public class LCM {
    public long calcLCM(int x, int y) {
        int a = x;
        int b = y;
        long res = 1;

        // Write your code here.
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            res = (long) x * y / b;
        } else {
            res = (long) x * y / a;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LCM m = new LCM();

        int x = s.nextInt();
        int y = s.nextInt();

        System.out.println(m.calcLCM(x, y));
        s.close();
    }
}
