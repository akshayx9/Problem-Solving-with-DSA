package JavaCollections;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();

        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        // forEach method of ArrayList & print numbers
        Numbers.forEach((n) -> System.out.println(n));
    }
}
