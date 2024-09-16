package day39;


public class stockBuyAndSell {
    public static void main(String[] args) {
        int a[] = { 12, 43, 21, 65, 3, 21, 5, 32, 45, 1 };
        int pro[] = new int[100];
        // we have to first buy the stock and then sell it
        // we can't do it reverce,,find the maximum profit

        // find the smallest element and buy it ,,and sell it on highest number
        // int buy = 0;
        // int sell = 0;
        // int profit = 0;
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = i + 1; j < a.length; j++) {
        //         buy = a[i];
        //         sell = a[j];
        //         profit = buy - sell;
        //     }
        //     pro[i] = profit;
        // }

        // int maxprofit = 0;
        // for (int i = 0; i < pro.length; i++) {
        //     for (int j = 0; j < pro.length; j++) {
        //         if (pro[i] > pro[j]) {
        //             maxprofit = pro[i];
        //         }
        //     }
        // }
        // System.out.println();
        // System.out.println(maxprofit);

        // technic 2

        int maxprofit = 0;
        int minsofar = a[0];

        for (int i = 0; i < a.length; i++) {
            minsofar = Math.min(minsofar, a[i]);
            int profit = a[i] - minsofar;
            maxprofit = Math.max(maxprofit, profit);

        }
        System.out.println(maxprofit);
    }
}
