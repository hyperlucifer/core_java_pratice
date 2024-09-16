package day1;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int a,b;
        a=0;
        b=1;
        System.out.println(a+"\n"+b);
        for(int i=0;i<num-2;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
