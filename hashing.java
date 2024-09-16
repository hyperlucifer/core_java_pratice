package day47;
import java.util.*;
/*
 * in hashing Insert,Search,Delete all happen in O(1) time comlexicity
 * we use space in it
 * 
 * hashset has no order to store the element 
 * it store the elements in ramdom order
 */
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<>();
      //to add a element to the set  
        s.add(5);
        s.add(10);
    //to print entire set
        System.out.println(s);
        //to check if the element is present or not
        if (s.contains(10)) {
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        //to remove the element
        s.remove(10);
        //to check weather the set is empty
        System.out.println(s.isEmpty());
        //ot check the size of the set
        System.out.println(s.size());
        //to remove all the element of the set
        s.clear();
    }
}
