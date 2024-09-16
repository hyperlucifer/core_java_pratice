package day24;
import java.util.*;

/*
 * hashset is the collection of the unique items(dublicate is not allowod)
 * 
 * we use hashset because it gives scearch in constant time O(1);
 * 
 */
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(6,0.5f);//<<--we can give innatial capacity and load factor 
        h1.add(21);
        h1.add(2);
        h1.add(1);
        h1.add(3);
        h1.add(5);
        System.out.println(h1);
    }
}
