package day28;

import java.util.*;
public class reverceArray {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(4);

        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }    
}
