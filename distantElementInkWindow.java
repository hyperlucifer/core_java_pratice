package day49;

import java.util.*;

public class distantElementInkWindow {
    static void countDistincElement(int a[],int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=k;i<k;i++){
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        System.out.println(map.size());
        for(int i=k;i<a.length;i++){
            if (map.get(a[i-k])==1) {
                map.remove(a[i-k]);
            }
            else{
                map.put(a[i-k],map.get(a[i-k])-1);
            }
            map.put(a[i],map.getOrDefault(a[i], 0)+1);
            System.out.println(map.size());
        }
    }
    public static void main(String[] args) {
        System.out.println(106/2);
        System.out.println(65-53);
    }    
}
