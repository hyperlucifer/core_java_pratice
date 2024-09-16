package day52;

import java.util.Scanner;

public class pal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        try {
            int n = sc.nextInt();
            if (n < 0) {
                throw new Exception("the number is Zero");
            } else {
                int t = n;
                int p = 0;
                while (t != 0) {
                    int m = t % 10;
                    p = p * 10 +m ;
                    t /= 10;
                }
                if (n == p) {
                    System.out.println("the number is paladrome");

                } else {
                    System.out.println("the number is not paladrome");
                }
            }
        } catch (Exception e) {
            System.out.println("the number is non numric");
        }
        finally{
        sc.close();
        }
    }
}
