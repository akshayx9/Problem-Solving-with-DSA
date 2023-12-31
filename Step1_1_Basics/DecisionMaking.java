package Step1_1_Basics;

/*

Programming languages have some conditional / 
decision-making statements that execute when 
some specific condition is fulfilled.


If-else is one of the ways to implement them.

You are given two numbers 'a' & 'b'. 
Compare the numbers and print the relation.

Print “smaller”, “greater” or “equal” when 
‘a’ is smaller than ‘b’, greater than ‘b’, 
or equal to ‘b’ respectively.

*/

public class DecisionMaking {
    public static String compareIfElse(int a, int b) {
        if (a < b) {
            return "smaller";
        } else if (a > b) {
            return "greater";
        } else {
            return "equal";
        }
    }
}
