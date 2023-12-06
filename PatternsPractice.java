import java.util.Scanner;

public class PatternsPractice {
    public void Pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void Pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void Pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void Pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void Pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * n - (2 * i - 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void Pattern10(int n) {
        int stars = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i < n) {
                stars = i;
            } else {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public void Pattern12(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    public void Pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public void Pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void Pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void Pattern16(int n){
        char ch = 'A';
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
            ch++;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        PatternsPractice pp = new PatternsPractice();
        pp.Pattern16(n);

        s.close();
    }
}
