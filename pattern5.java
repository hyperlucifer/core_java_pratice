package day2;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows=sc.nextInt();
        for(int i=0;i<=rows;i++){
            for(int b=0;b<i;b++){
                System.out.print(" ");
            }
            for(int j=0;j<rows+1-i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
