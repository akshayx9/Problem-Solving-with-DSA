import java.util.Scanner;

/*

Write a program that takes a character as input and 
prints 1, 0, or  1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.

*/

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(1);
        } else if (Character.isLowerCase(ch)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
        s.close();
    }
}
