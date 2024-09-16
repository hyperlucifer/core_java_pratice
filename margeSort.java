package day43;

/*
 * it uses divide and conquer
 * we will divide the problem into smaller part and then solve them
 * there is no relation between those sub-problems(this thing differ it from dynamic programming)
 * 
 */

public class margeSort {

    static void marge_sh(int a[], int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            marge_sh(a, l, mid);
            marge_sh(a, mid + 1, r);
            merge(a, l, mid, r);
        }

    }

    static void merge(int a[], int l, int mid, int r) {
        int b[] = new int[a.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (j <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                k++;
                j++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    public static void main(String[] args) {
        int a[] = { 7, 34, 8, 2, 1, 9 };
        marge_sh(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
