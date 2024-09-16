package day48;

import java.util.HashSet;
import java.util.Set;

public class hashingQueation {
    //count the distint element
    //set dose not store the dublicate value
    static int countDis(int a[]){
        Set<Integer> s=new HashSet<>();
        for(int element : a){
            s.add(element);
        }
        return s.size();
    }
    //union array 
    //take 2 arrays and return the count of the unique element present in the both array
    static int union(int a[],int b[]){
        Set<Integer> s=new HashSet<>();
        for(int x:a){
            s.add(x);
        }
        for(int y:b){
            s.add(y);
        }
        return s.size();
    }
    //intersection of two array
    //take 2 arrays and return the count of the common element present in the both array

    static int intersection(int a[],int b[]){
        Set<Integer> s =new HashSet<>();
        int count=0;
        for(int x:a){
            s.add(x);
        }
        for(int x:b){
            if (s.contains(x)) {
                count++;
                s.remove(x);                
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={12,54,23,76,76};
        System.out.println(countDis(a));
    }
}
