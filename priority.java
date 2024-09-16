package day51;

import java.util.*;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> p2 = new PriorityQueue<>();// it makes min heap by default
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());// it makes max heap
        pq.add(5);
        pq.add(15);
        pq.add(10);
        System.out.println(pq.size());
        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");// shows the top most element
            pq.poll();// delete a top most element
        }
    }
}
