package day45;

public class infaniteB_Scearch {

    static int ScearchInfinity(int a[], int key) {
        int low = 0;
        int high = 1;
        while (a[high] < key) {
            low = high;
            high = 2 * high;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {

    }
}
