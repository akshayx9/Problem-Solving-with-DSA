package Step1_4_BasicMaths;
/*
Problem Statement

Given a signed 32-bit integer x, return x 
with its digits reversed. 

If reversing x causes the value to go outside 
the signed 32-bit integer range [-2^31, 2^31 - 1], 
then return 0.

Assume the environment does not allow you to store 
64-bit integers (signed or unsigned).

Constraints:

-2^31 <= x <= 2^31 - 1

*/

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit;
            x = x / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(321));
    }
}
