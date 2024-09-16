package day1;
import java.util.Scanner;

public class sumofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int sum=0;
        while (num!=0) {
            int m=num%10;
            sum=sum+m;
            num=num/10;
        }
        System.out.println(sum);
    }
}
