package Step1_4_BasicMaths;
/*

Problem Statement

You are given a number 'n'.

Find the number of digits of 'n' that evenly divide 'n'.

Note:

A digit evenly divides 'n' if it leaves no remainder when dividing 'n'.

*/

public class CountDigits {
    public int divDigitsCount(int n) {
        int digit = 0;
        int temp = n;
        int count = 0;
        while (temp != 0) {
            digit = temp % 10;
            if (digit != 0 && n % digit == 0) {
                count++;
            }
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        CountDigits cd = new CountDigits();

        System.out.println(cd.divDigitsCount(222));
    }
}

// Time Complexity - O(log N) i.e. log base 10 of N
