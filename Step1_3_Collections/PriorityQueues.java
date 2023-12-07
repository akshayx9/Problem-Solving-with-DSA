package Step1_3_Collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {

        // for implementing min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(12);
        pq.offer(40);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println("******************");

        // for implementing max heap - here we use a Comparator to achieve this.
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq2.offer(12);
        pq2.offer(40);
        pq2.offer(24);
        pq2.offer(36);

        System.out.println(pq2);

        System.out.println(pq2.poll());

        System.out.println(pq2);

        System.out.println(pq2.peek());
    }
}
