package day51;

public class heapShort {
    /*
     * heapify is a other technic to make a heap
     * it takes O(n) time  
     */
    static void heapify(int a[],int n,int i){//i is the position from which we want to start 
        int largest=i;                       //to craeate the heap
        int l=2*i;
        int r=2*i+1;
        
        if (l<=n&&a[l]>a[largest]) {//first cond will check if the left is overloading 
            largest=l;              //second will clecl if left element is greater from its parent/root
        }
        if (r<=n&&a[r]>a[largest]) {//first cond will check if the right is overloading 
            largest=r;              //second will clecl if right element is greater from its parent/root
        }
        if (largest!=i) {// if largest dont change then then swap the largest value to the current index
            swap(a,i,largest);
            heapify(a, n, largest);
        }
    }
    static void swap(int[] a, int i, int largest) {
        int t=a[i];
        a[i]=a[largest];
        a[largest]=t;
    }
    static void bildheap(int a[],int n){
        for(int i=n/2;i>=0;i--){
            heapify(a, n, i);
        }
    }
    static void heapShort(int a[],int n){
        for (int i=n;i>1;i--) {
            swap(a, 1, i);
            heapify(a, i-1, 1);
        }
    }
    public static void main(String[] args) {
        int a[]={3,56,12,43,6};
       bildheap(a, a.length-1);
       heapShort(a, a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
