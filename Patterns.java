import java.util.Scanner;

public class Patterns {
    public static void printPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        // Pattern 1
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern1(n);
        }

        // Pattern 2
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern2(n);
        }

        // Pattern3
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern3(n);
        }
        s.close();
    }
}
