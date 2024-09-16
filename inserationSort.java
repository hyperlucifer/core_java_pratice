package day42;

/*
 * it divide the array in 2 parts
 * sorted and unsorted 
 * 
 * insrert the element from unshorted to sorted array on the right position 
 */
public class inserationSort {
    public static void main(String[] args) {
        int a[] = { 8, 4, 1, 5, 9, 2 };
        for (int i = 1; i < 6; i++) {//outer loop is running from left to right -->>
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) { //inner loop in running from right to left <<--
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
         for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }   
    }
}
