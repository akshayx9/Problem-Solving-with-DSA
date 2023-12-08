package Step1_4_BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public boolean isArmstrong(int n) {
        int num = n;
        int count = 0;
        int temp = n;

        // Finding the number of digits in 'n' first
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Armstrong a = new Armstrong();
        System.out.println(a.isArmstrong(n));

        s.close();
    }
}
