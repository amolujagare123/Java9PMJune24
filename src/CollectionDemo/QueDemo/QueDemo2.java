package CollectionDemo.QueDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueDemo2 {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(62);
        pq.offer(92);
        pq.offer(42);
        pq.offer(72);
        pq.offer(12);
       // pq.offer('h');

        // 12,42,62,72,92

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
