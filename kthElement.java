package day51;

import java.util.PriorityQueue;

public class kthElement {
    static int kthLargestElement(int a[],int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(a[i]);
        }
        for(int i=k;i<a.length;i++){
            if (pq.peek()<a[i]) {
                pq.poll();
                pq.add(a[i]);
            }
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int a[]={12,56,34,88};
        System.out.println(kthLargestElement(a, 3));
    }
}
