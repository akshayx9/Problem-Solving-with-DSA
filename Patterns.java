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
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void printPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }

    public static void printPattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void printPattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
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

        // Pattern 3
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern3(n);
        }

        // Pattern 4
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern4(n);
        }

        // Pattern 5
        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern5(n);
        }

        for (int i = 0; i < t; i++) {
            int n = s.nextInt();
            Patterns.printPattern6(n);
        }
        s.close();
    }
}
