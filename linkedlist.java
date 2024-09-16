package day29;

import java.util.*;

public class linkedlist {
   public static void main(String[] args) {
     LinkedList<String> ll = new LinkedList<String>(); 
  
         
        ll.add("CPP"); 
        ll.add("JAVA"); 
        ll.addLast("PYTHON"); 
        ll.addFirst("PHP");
        
        for (int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        for (int i=ll.size()-1;i>=0;i--){
            System.out.println(ll.get(i));
        }
   }
}
