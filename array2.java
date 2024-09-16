package day38;

public class array2 {
    static int majorityElement(int a[]){
        int ansindex=0;
        int count=1;
        for(int i=1;i<a.length;i++){
            if (a[i]==a[ansindex]) {
                count++;
            }
            else{
                count--;
            }
            if (count ==0) {
                ansindex=i;
                count=1;
            }
        }
        return a[ansindex];
    }
    public static void main(String[] args) {
        int a[]={1,5,5,3,5};
    }
}
