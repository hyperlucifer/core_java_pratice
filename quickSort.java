package day43;

/*
 * in this it start with 0th index of i and last index for j 
 * it tells send the smaller element in front of me and send bigger element at rear of me
 * 
 * if j<i then swap both
 * do i++ and j--
 * 
 * 0 th element is the pivit
 * 
 * when i and j crosses each other
 * then swap i to pivit
 * 
 * now the pivit is on its right place
 * 
 * this thing will repate it self until the array is sort
 */

public class quickSort {
    static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static int partation(int a[], int l, int h) {
        int pivot = a[l];
        int i = l + 1; // Start i from the next index
        int j = h;

        while (i <= j) {
            while (i <= j && a[i] <= pivot)
                i++;
            while (i <= j && a[j] > pivot)
                j--;
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, j, l);
        return j;
    }

    static void quick(int a[], int l, int h) {
        if (l < h) {
            int pivot = partation(a, l, h);
            quick(a, l, pivot - 1);
            quick(a, pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int a[] = { 4, 6, 2, 5, 7, 9, 1, 3 };

        int l = 0;
        int h = a.length - 1;

        quick(a, l, h);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
