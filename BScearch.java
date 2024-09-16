package day46;
//Scearching a element in sorted and roteted array

/*
 * 1)find the mid of the array 
 * 2)cheak which side from mid is sorted in the array 
 *      for checking left check if the a[0]<key then the left side is sorted
 *      for right side check if a[a.length-1]>key then the right side is sorted 
 * 3)only one side can be sorted at a time
 * 4)then check where the key exist and search the element by binery scearch method  
 */
public class BScearch {

    static int bScearch(int a[],int key){
        int low =0,high=a.length-1;
        while (low<=high) {
            int mid =(low+high)/2;
            if(a[mid]==key){
                return mid;
            }
            if (a[low]<a[mid]) {
                if (key>=a[low]&&key<a[mid]) {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else{
                if (key>a[mid]&&key<a[high]) {
                    low=mid+1;
                }
                else{
                    high=mid-1; 
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={20,30,40,50,5,10};
        System.out.println( bScearch(a, 5));
       
    }
}
