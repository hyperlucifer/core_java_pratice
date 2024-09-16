package day48;

import java.util.*;
public class subArrayofWithTheGivenSum {
    static void SubArraySum(int a[],int sum){
        int cursum =0;
        int start =0;
        int end =0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            cursum+=a[i];
            if (cursum-sum==0) {
                start=0;
                end=i;
                break;
            }
            if (map.containsKey(cursum-sum)) {
                start = map.get(cursum-sum)+1;
                end =i;
                break;
            }
            map.put(cursum,i);
        }
        if (end==-1) {
            System.out.println("not found");
        }
        else{
            System.out.println(start+" "+end);
        }
    }
    public static void main(String[] args) {
        
    }
}
