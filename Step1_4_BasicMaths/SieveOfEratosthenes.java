package Step1_4_BasicMaths;

import java.util.Arrays;

/* 

Given a number n, print all primes smaller than 
or equal to n. It is also given that n is a small number.

To solve this problem we can use a Sieve. 
Sieve of Eratosthenes is the algorithm to find all 
the prime numbers less than or equal to a given 
integer n. The algorithm terminates, all the numbers 
in the list that are not marked are prime */

public class SieveOfEratosthenes {
    public void sieve(int n) {
        Boolean[] isPrime = new Boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.sieve(100);
    }
}
