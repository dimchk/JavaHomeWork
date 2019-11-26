package lesson5;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queues {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priority  = new PriorityQueue<Integer>();
//        priority.add(9);
//        priority.add(12);
//        priority.add(9);
//        priority.add(2);
//
//        //Integer first = priority.peek();
//        Integer first = priority.poll();
//        System.out.println(first);
//        System.out.println(priority);


        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        deque.offer(12);
        deque.offer(5);
        deque.offer(3);
        deque.offer(12);


        Integer e;
        deque.offerLast(1);
        deque.offerFirst(144);

        deque.addLast(999);
        System.out.println(deque);
        System.out.println(deque.peek());
    }
}
