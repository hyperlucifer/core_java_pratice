package day52;

import java.util.Scanner;

public class rangeNum {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        sc.close();
        if (n>100) {
            throw new Exception("the number is out of range");
        }
        else{
            int sum=0;
            while (n!=0) {
                int m=n%10;
                sum=sum+m;
                n/=10;
            }
            System.out.println("the addition is "+sum);
        }
    }
}
