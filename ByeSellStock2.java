package day40;


public class ByeSellStock2 {
    public static void main(String[] args) {
        //in this problem we can buy and sell the stocks many times,,but we cant 
        //buy two stock at a time ,,first sell the current stock and the buy the next one
        
        int a[]={5,2,6,1,4,7,3,6};
        int profit=0;
        for(int i=1;i<a.length;i++){
            if (a[i]>a[i-1]) {
                profit=profit+(a[i]-a[i-1]);
            }
        }
        System.out.println(profit);
    }    
}

