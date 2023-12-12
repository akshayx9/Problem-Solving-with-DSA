package Step1_4_BasicMaths;
/* Problem Statement

You are given an integer 'n', you need to find the number of trailing zeroes in the n! (n factorial).  */

public class TrailingZeros {
    public int zeros(int n) {
        int res = 0;

        for (int i = 5; i <= n; i = i * 5) {
            res = res + n / i;
        }
        return res;
    }

    public static void main(String[] args) {
        TrailingZeros tz = new TrailingZeros();
        System.out.println(tz.zeros(100));
    }
}
