package day37;

import java.util.HashMap;

public class array {
    public static void main(String[] args) {
        int a[] = {1,5,5,5,4};
        //majority element ,find the element that is present more then two times in an array

        //technic 1
        //we will count the occerance of each element in the a array if the count is greater then 
        //n/2 then that element has the higests occerance
        //time complexcity is O(N^2) ,,space complexity is 0(1)
        int count=0;
        int maxcount=0;
        // for(int i=0;i<a.length;i++){
        //     for (int j=i+1;j<a.length;j++){
        //         if (a[i]==a[j]) {
        //             count++;
        //             maxcount=a[i];
        //         }
        //     }
        // }
        //System.out.println(maxcount);
        
        //technic 2
        //here we will short the elements and then count the occerance of the element
        //sort time complexity is n(log n) the time complexity of count is O(n);
        //n(log n)+O(n)=O(n log n)
        
    //    Arrays.sort(a);
    //     for(int i=0;i<4;i++){
    //         if (a[i]==a[i+1]) {
    //             count++;
    //             maxcount=a[i];
    //         }
    //     }
    //     System.out.println(maxcount);
    HashMap<Integer,Integer> max=new HashMap<>();
    int count1=1;
        for(int i=0;i<a.length;i++){
            max.put(a[i],count1);
            if(a[i]==max.get(a[i])){
                
            }
        }
        System.out.println(max.containsKey(max));
    }
}
