package day42;

/*
 * it also divide array in two parts 
 * sorted and unsorted 
 * it takes smallest element in the unsorted array and insert it in sorted array at the i position
 */

public class selectionSort {
    public static void main(String[] args) {
        int a[]={4,1,9,2,3,6};

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if (a[j]<a[min]) {
                    min=j;
                }
            }
            if (min!=i) {
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
                
            }
        }
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
