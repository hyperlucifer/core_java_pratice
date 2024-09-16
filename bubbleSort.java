package day41;
/*
 * check if right element smaller then left ,,if it is then swap them
 * and move forward
 */
public class bubbleSort {
    public static void main(String[] args) {
        int a[]={8,24,1,9,6,2};

        /*
         * to optimize this algo if the array is sorted in n<itearations we can have a check
         */
        for(int i=0;i<6-1;i++){
            boolean swaped=false;
            for(int j=0;j<6-i-1;j++){//last element is on its right position after every itration
                if (a[j+1]<a[j]) {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    swaped=true;
                }
            }
            if (!swaped) {
                break;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
