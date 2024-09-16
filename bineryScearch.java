package day44;

/*
 * steps
 * 1)find the mid index : mid =(low + high)/2;
 * 2)If a[mid]==key.return mid
 * 3)if key>a[mid],repeat low =mid+1;
 * 4)if key<a[mid],repeat high=mid-1; 
 */
public class bineryScearch {
    static int binery(int a[], int key) {
        int low = 0, high = a.length - 1;
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
        int a[] = { 2, 5, 4, 8, 12, 19 };
        System.out.println(binery(a, 19));
    }
}
