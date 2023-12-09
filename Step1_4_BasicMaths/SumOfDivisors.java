package Step1_4_BasicMaths;

import java.util.Scanner;

public class SumOfDivisors {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            int t1 = i * (n / i - i + 1);
            int t2 = (((n / i) * (n / i + 1)) / 2) - ((i * (i + 1)) / 2);
            sum += t1 + t2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SumOfDivisors sd = new SumOfDivisors();

        int n = s.nextInt();
        System.out.println(sd.divisorSum(n));

        s.close();
    }
}
