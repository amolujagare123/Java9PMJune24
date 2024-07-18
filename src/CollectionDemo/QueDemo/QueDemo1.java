package CollectionDemo.QueDemo;

import java.util.ArrayDeque;

public class QueDemo1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(32);
        adq.offer(42);
        adq.offer(42);
        adq.offer(52);
        adq.offer(62);


        System.out.println(adq);
       /* System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq);*/

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);
        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
