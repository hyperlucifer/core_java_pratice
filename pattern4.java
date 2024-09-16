package day2;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=0;
        System.out.println("enter the number of rows ");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                k++;
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
    
}
