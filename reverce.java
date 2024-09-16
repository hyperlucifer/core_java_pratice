package day1;
import java.util.Scanner;

public class reverce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int rev=0;
        while (num!=0) {
            int m=num%10;
            rev=m+(rev*10);
            num=num/10;
        }
        System.out.println(rev);
    }
}
