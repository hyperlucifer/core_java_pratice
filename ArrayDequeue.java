package day23;
import java.util.*;
/*
 * this will make a array internally and take size automatically and can resize it
 * it can insert and delete from both the ends
 */
public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.addFirst(21);
        System.out.println(a1.isEmpty());
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());

    }
}
