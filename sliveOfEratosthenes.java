package day35;

import java.util.Arrays;

public class sliveOfEratosthenes {

    static boolean[] prime(int n){

        boolean isPrime[]=new boolean[n+1];

        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<=n;i++){//this condition repreasents i is less then root n
            for(int j=2*i;j<=n;j+=i){//this loop tells start from the second multipal of i;it is updating that it is jumping from i's multiple
            isPrime[j]=false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        boolean isPrime[]=prime(20);
        for(int i=0;i<=20;i++){
            System.out.println(i+" "+isPrime[i]);
        }
    }
}
