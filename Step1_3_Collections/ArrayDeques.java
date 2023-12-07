package Step1_3_Collections;

import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23); // adds element to the end
        adq.offerFirst(12); // adds element to the start
        adq.offerLast(45); // adds element to the end
        adq.offer(26);// adds element to the end

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll()" + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst()" + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast()" + adq);
    }
}
