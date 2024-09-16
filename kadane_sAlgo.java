package day38;

public class kadane_sAlgo {
    //Maximum sum of sub array 
    static int maxSumArray(int a[]){
        int maxsum=0;
        int cursum=0;
        for(int i=0;i<a.length;i++){
            cursum=cursum+a[i];
            if (cursum>maxsum) {
                maxsum=cursum;
            }
            if (cursum<0) {
                cursum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int a[]={2,-3,12,-4,23};
        System.out.println(maxSumArray(a));
    }
}
                                              