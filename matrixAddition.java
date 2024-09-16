package day54;

import java.util.Scanner;

public class matrixAddition {

    static void accept(int a[][],int n){
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("enter the value for point "+i+" "+j);
                a[i][j]=sc.nextInt();
            }
        }
    } 
    public static void main(String[] args) {
        int n=3;
        int a[][]=new int[n][n];
        System.out.println("enter the value for matrix 1");
        accept(a, n);
        int b[][]=new int[n][n];
        System.out.println("enter the value for matrix 2 ");
        accept(b, n);
        int c[][]=new int[n][n];
    }
}
