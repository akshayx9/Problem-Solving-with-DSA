/*

Programming languages have some conditional / 
decision-making statements that execute when 
some specific condition is fulfilled.

Switch-case is one of the ways to implement them.

In a menu-driven program, the user is given a set 
of choices of things to do (the menu) and then is 
asked to select a menu item.

There are 2 choices in the menu:

Choice 1 is to find the area of a circle having radius 'r'.
Choice 2 is to find the area of a rectangle having dimensions 'l' & 'b'.

You are given the choice 'ch' & array 'a'.

If ‘ch’ is 1, ‘a’ contains a single number ‘r’. 
If ‘ch’ is 2, ‘a’ contains 2 numbers, ‘l’ and ‘b’.

Consider the choice and print the appropriate area.

*/

public class SwitchCaseStatement {
    public static double areaSwitchCase(int ch, double[] a) {
        double area = 0;
        switch (ch) {
            case 1: {
                area = Math.PI * a[0] * a[0];
                break;
            }
            case 2: {
                area = a[0] * a[1];
                break;
            }
            default: {
                area = 0;
            }
        }
        return area;
    }
}
