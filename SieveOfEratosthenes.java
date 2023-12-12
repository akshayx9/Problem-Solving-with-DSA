import java.util.Arrays;

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
